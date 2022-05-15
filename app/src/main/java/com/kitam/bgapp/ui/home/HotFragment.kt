package com.kitam.bgapp.ui.home
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kitam.bgapp.MainActivity
import com.kitam.bgapp.data.data.BoardGame
import com.kitam.bgapp.model.BoardGameViewModel
import com.kitam.bgapp.R
import com.kitam.bgapp.databinding.FragmentHotBinding
import com.addisonelliott.segmentedbutton.SegmentedButtonGroup.OnPositionChangedListener
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdLoader
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.nativead.NativeAd
import com.google.android.gms.ads.nativead.NativeAdOptions
import com.kitam.bgapp.tools.isNull
import android.text.StaticLayout

import android.os.Build.VERSION_CODES

import android.os.Build.VERSION
import android.widget.ImageView
import android.widget.Toast
import androidx.viewbinding.ViewBinding
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import org.imaginativeworld.whynotimagecarousel.listener.CarouselListener
import org.imaginativeworld.whynotimagecarousel.model.CarouselGravity
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem
import org.imaginativeworld.whynotimagecarousel.model.CarouselType
import org.imaginativeworld.whynotimagecarousel.utils.dpToPx
import org.imaginativeworld.whynotimagecarousel.utils.spToPx


class HotFragment : Fragment(), HotRecyclerAdapter.Callback {

    private lateinit var homeViewModel: HomeViewModel
    private val boardGameViewModel: BoardGameViewModel by activityViewModels()
    private var _binding:FragmentHotBinding? = null
    private val binding get() = _binding!!


    lateinit var mRecyclerView : RecyclerView
    val mAdapter : HotRecyclerAdapter = HotRecyclerAdapter()

    var isGrid = true
    var lastFavoritedPosition = 0;


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHotBinding.inflate(inflater, container, false)

        //boardGameViewModel.onCreate()
        binding.imageSlider.registerLifecycle(viewLifecycleOwner)


        binding.ibListType.setOnClickListener{

            if(isGrid){
                binding.ibListType.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.outline_list_24))
                showList()
            }else{
                binding.ibListType.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.outline_grid_view_24))
                showGrid()
            }

            isGrid = !isGrid
        }

        binding.sbListType.onPositionChangedListener = OnPositionChangedListener {
            switchList(it)
        }





        return binding.root
    }

    fun switchList(position:Int){

        if(position == 1){
            if(!boardGameViewModel.upcomingGamesList.value.isNull()) {
                isGrid = true
                setUpRecyclerView(boardGameViewModel.upcomingGamesList.value!!, true, false)
            }

        }else if(position == 0){
            if(!boardGameViewModel.hotGamesList.value.isNull()) {
                isGrid = true
                setUpRecyclerView(boardGameViewModel.hotGamesList.value!!, false, false)
            }
        }else if(position == 2){
            if(!boardGameViewModel.topGamesList.value.isNull()) {
                isGrid = false
                setUpRecyclerView(boardGameViewModel.topGamesList.value!!, false, true)
            }

        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        boardGameViewModel.hotGamesList.observe(viewLifecycleOwner, Observer { list ->
            if(!boardGameViewModel.firstSetup.value!!)
            if(binding.sbListType.position == 0){
                setUpRecyclerView(list, false, false)
            }


        })

        boardGameViewModel.upcomingGamesList.observe(viewLifecycleOwner, Observer { list ->

           // if(!boardGameViewModel.firstSetup.value!!)
            if(binding.sbListType.position == 1){
                setUpRecyclerView(list, true, false)
            }


        })

        boardGameViewModel.topGamesList.observe(viewLifecycleOwner, Observer { list ->

            if(!boardGameViewModel.firstSetup.value!!)
            if(binding.sbListType.position == 2){
                setUpRecyclerView(list, false, true)
            }


        })

        boardGameViewModel.customGameslist.observe(viewLifecycleOwner, { list ->

            if(list.isNullOrEmpty()){
                binding.imageSlider.visibility = View.GONE
            }else {

                val imageList = ArrayList<CarouselItem>() // Create image list

                for (game in list) {
                    imageList.add(CarouselItem(game.imageurl))
                }


                /*  binding.imageSlider.carouselType = CarouselType.SHOWCASE
            binding.imageSlider.carouselGravity = CarouselGravity.CENTER
            binding.imageSlider.imageScaleType = ImageView.ScaleType.CENTER

            // Carousel listener
            binding.imageSlider.carouselListener = object : CarouselListener {

                override fun onClick(position: Int, carouselItem: CarouselItem) {
                    try {
                        onBoardGameClicked(boardGameViewModel.customGameslist.value!![position])
                    }catch (e:Exception){

                    }
                }


            }*/

                binding.imageSlider.apply {
                    registerLifecycle(lifecycle)
                    visibility = View.VISIBLE
                    showTopShadow = false
                    topShadowAlpha = 0.15f // 0 to 1, 1 means 100%
                    topShadowHeight = 32.dpToPx(context) // px value of dp

                    showBottomShadow = false
                    bottomShadowAlpha = 0.6f // 0 to 1, 1 means 100%
                    bottomShadowHeight = 64.dpToPx(context) // px value of dp

                    showCaption = true
                    captionMargin = 0.dpToPx(context) // px value of dp
                    captionTextSize = 14.spToPx(context) // px value of sp

                    showIndicator = true
                    indicatorMargin = 0.dpToPx(context) // px value of dp

                    imageScaleType = ImageView.ScaleType.FIT_CENTER

                    carouselBackground = ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.image_slider_gradient_2
                    )
                    imagePlaceholder = ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.dice_detailed
                    )

                    carouselPadding = 0.dpToPx(context)
                    carouselPaddingStart = 0.dpToPx(context)
                    carouselPaddingTop = 5.dpToPx(context)
                    carouselPaddingEnd = 0.dpToPx(context)
                    carouselPaddingBottom = 5.dpToPx(context)

                    showNavigationButtons = false
                    previousButtonLayout =
                        org.imaginativeworld.whynotimagecarousel.R.layout.previous_button_layout
                    previousButtonId =
                        org.imaginativeworld.whynotimagecarousel.R.id.btn_previous
                    previousButtonMargin = 4.dpToPx(context) // px value of dp
                    nextButtonLayout =
                        org.imaginativeworld.whynotimagecarousel.R.layout.next_button_layout
                    nextButtonId = org.imaginativeworld.whynotimagecarousel.R.id.btn_next
                    nextButtonMargin = 4.dpToPx(context) // px value of dp

                    carouselType = CarouselType.SHOWCASE

                    carouselGravity = CarouselGravity.CENTER

                    scaleOnScroll = false
                    scalingFactor = .15f // 0 to 1; 1 means 100
                    autoWidthFixing = false
                    autoPlay = true
                    autoPlayDelay = 4000 // Milliseconds
                    infiniteCarousel = true
                    touchToPause = true

                    carouselListener = object : CarouselListener {
                        override fun onClick(position: Int, carouselItem: CarouselItem) {
                            onBoardGameClicked(boardGameViewModel.customGameslist.value!![position])
                        }

                        override fun onLongClick(position: Int, carouselItem: CarouselItem) {

                        }
                    }
                }

                binding.imageSlider.setData(imageList)
            }

        })




        boardGameViewModel.favGamesList.observe(viewLifecycleOwner, {
            try {
                if (it != null) {
                    if (boardGameViewModel.firstSetup.value!!) {
                        switchList(binding.sbListType.position)
                        boardGameViewModel.firstSetup.postValue(false)
                    } else {
                        mAdapter.favGames = it
                        mAdapter.notifyItemChanged(lastFavoritedPosition)
                    }

                } else {
                    boardGameViewModel.firstSetup.postValue(false)
                    switchList(binding.sbListType.position)

                }
            }catch (e:Exception){
                boardGameViewModel.toastText.postValue("Ocurrió un error al cargar el listado de juego, por favor intenta de nuevo más tarde")

            }
        })


        boardGameViewModel.isLoading.observe(viewLifecycleOwner, Observer {
            (activity as MainActivity).progressBar?.isVisible = it
        })



    }

    override fun onResume() {
        super.onResume()

    }

    fun setUpRecyclerView(mList:List<BoardGame>, showYear:Boolean, showRank:Boolean){
        mRecyclerView = binding.rvHotList
        mRecyclerView.setHasFixedSize(true)
        if(boardGameViewModel.favGamesList.value.isNullOrEmpty()){
            mAdapter.HotRecyclerAdapter(mList, emptyList(), requireContext(), this)

        }else{
            mAdapter.HotRecyclerAdapter(mList, boardGameViewModel.favGamesList.value!!, requireContext(), this)

        }
        mAdapter.showYear = showYear
        mAdapter.showRank = showRank
        if(isGrid) {
            showGrid()
        }else{
            showList()
        }

    }



    private fun showList() {
        mRecyclerView.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        mAdapter.setLayoutResourceId(R.layout.item_hot_list)
        mRecyclerView.adapter = mAdapter


    }

    private fun showGrid() {
        mRecyclerView.layoutManager = GridLayoutManager(activity, 2)
        mAdapter.setLayoutResourceId(R.layout.item_hot_grid)
        mRecyclerView.adapter = mAdapter

    }

    override fun onBoardGameClicked(boardGame: BoardGame) {
       // boardGameViewModel.boardGameDescription(boardGame.id)
        boardGameViewModel.selectedBoardGame.postValue(boardGame)
        this.findNavController().navigate(R.id.navigation_home)

    }

    override fun onFavBoardGameClicked(boardGame: BoardGame, position:Int, isFavorite:Boolean) {
        lastFavoritedPosition = position

        if(isFavorite){
            boardGameViewModel.removeFavorite(boardGame)
        }else {
            boardGameViewModel.addFavorite(boardGame)
        }


    }

}