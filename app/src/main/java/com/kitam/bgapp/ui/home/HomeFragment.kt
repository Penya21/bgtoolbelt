package com.kitam.bgapp.ui.home
import android.graphics.drawable.Drawable
import android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.transition.ChangeBounds
import androidx.transition.TransitionManager
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.kitam.bgapp.MainActivity
import com.kitam.bgapp.data.data.BoardGameProperty
import com.kitam.bgapp.model.BoardGameViewModel
import com.kitam.bgapp.tools.removeHTML
import com.kitam.bgapp.R
import com.kitam.bgapp.databinding.FragmentHomeBinding
import com.kitam.bgapp.tools.isNull

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private val boardGameViewModel: BoardGameViewModel by activityViewModels()
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    var isDescriptionShowing = false
    var firstLoad = true
    var isDescriptionExpanded = false;
    val constraintSet1 = ConstraintSet()
    val constraintSet2 = ConstraintSet()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {

        })

        //boardGameViewModel.onCreate()
        firstLoad = true




        constraintSet1.clone(binding.viewContainer)
        constraintSet2.clone(context, R.layout.fragment_home_alt)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        isDescriptionShowing = false
      /*  binding.viewContainer.setOnClickListener{
            boardGameViewModel.randomQuote()

        }*/

        boardGameViewModel.selectedBoardGame.observe(viewLifecycleOwner, Observer { selectedBoardGame ->

            Glide.with(this)
                .load(selectedBoardGame.imageurl)
                .transition(DrawableTransitionOptions.withCrossFade())
                .fitCenter()
                .error(R.drawable.splash_background)
                .listener(object : RequestListener<Drawable> {
                    override fun onResourceReady(
                        resource: Drawable?,
                        model: Any?,
                        target: Target<Drawable>?,
                        dataSource: DataSource?,
                        isFirstResource: Boolean
                    ): Boolean {
                        startTransition()
                        return false

                    }

                    override fun onLoadFailed(
                        e: GlideException?,
                        model: Any?,
                        target: Target<Drawable>?,
                        isFirstResource: Boolean
                    ): Boolean {
                        startTransition()
                        return false
                    }
                })
                .into(binding.ivImage)

        })


        boardGameViewModel.boardGameModel.observe(viewLifecycleOwner, Observer { currentBoardGame ->



            binding.tvHome.text = currentBoardGame.item?.name
            binding.tvDescription.text = currentBoardGame.item?.shortDescription
            if(!currentBoardGame.item?.links?.boardgameartist.isNullOrEmpty()) {
                binding.tvAuthor.text = "Autor(a): " + currentBoardGame.item?.links!!.boardgamedesigner[0].name
            }else{
                binding.tvAuthor.visibility = View.GONE
            }

            if(!currentBoardGame.item?.rankinfo.isNullOrEmpty()) {
                binding.tvRank.text = "Posición: #" + currentBoardGame.item!!.rankinfo[0].rank
            }else{
                binding.tvRank.visibility = View.GONE
            }
            binding.tvYear.text = "Año: " + currentBoardGame.item?.yearpublished
            binding.ivExpandDescription.visibility = View.VISIBLE
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                binding.tvDescription.justificationMode = JUSTIFICATION_MODE_INTER_WORD
            }

            if(!currentBoardGame.item?.minage.isNullOrBlank()){
                binding.clAges.visibility = View.VISIBLE
                binding.tvAges.text = "+" + currentBoardGame.item?.minage + " años"
            }else{
                binding.clAges.visibility = View.GONE

            }

            if(!currentBoardGame.item?.minplayers.isNullOrBlank() || !currentBoardGame.item?.maxplayers.isNullOrBlank()){
                binding.clNumPlayers.visibility = View.VISIBLE
                if(currentBoardGame.item?.minplayers.equals(currentBoardGame.item?.maxplayers)){
                    binding.tvNumPlayers.text =
                        currentBoardGame.item?.minplayers
                }else {
                    binding.tvNumPlayers.text =
                        currentBoardGame.item?.minplayers + "-" + currentBoardGame.item?.maxplayers
                }
            }else{
                binding.clNumPlayers.visibility = View.GONE

            }

            if(!currentBoardGame.item?.minplaytime.isNullOrBlank() || !currentBoardGame.item?.maxplaytime.isNullOrBlank()){
                binding.clDuration.visibility = View.VISIBLE
                if(currentBoardGame.item?.minplaytime.equals(currentBoardGame.item?.maxplaytime)) {
                    binding.tvDuration.text = currentBoardGame.item?.minplaytime + " min"

                }else{
                    binding.tvDuration.text = currentBoardGame.item?.minplaytime + "-" + currentBoardGame.item?.maxplaytime + " min"

                }

            }else{
                binding.clDuration.visibility = View.GONE

            }

            if(!currentBoardGame.item?.polls?.boardgameweight?.averageweight.isNull()){
                when (currentBoardGame.item?.polls?.boardgameweight?.averageweight!!) {
                    in 0.0f..0.9999f -> binding.tvDifficulty.text = "Muy Fácil"
                    in 1.0f..1.9999f -> binding.tvDifficulty.text = "Fácil"
                    in 2.0f..2.9999f -> binding.tvDifficulty.text = "Medio"
                    in 3.0f..3.9999f -> binding.tvDifficulty.text = "Difícil"
                    else -> { // Note the block
                        binding.tvDifficulty.text = "Muy Difícil"
                    }
                }
                binding.clDifficulty.visibility = View.VISIBLE
            }else{
                binding.clDifficulty.visibility = View.GONE

            }

            val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

            imageList.add(SlideModel(currentBoardGame.item?.imageSets?.mediacard?.src2x))
            imageList.add(SlideModel(boardGameViewModel.selectedBoardGame.value?.imageurl))
            imageList.add(SlideModel(currentBoardGame.item?.topimageurl))

            binding.imageSlider.setImageList(imageList)

            binding.imageSlider.visibility = View.VISIBLE
            binding.ivImage.visibility = View.GONE

            binding.imageSlider.setItemClickListener(object : ItemClickListener {
                override fun onItemSelected(position: Int) {
                    // You can listen here
                }
            })



        })

        boardGameViewModel.isLoading.observe(viewLifecycleOwner, Observer {
            (activity as MainActivity).progressBar?.isVisible = it
        })

        binding.ivExpandDescription.setOnClickListener {
            if(isDescriptionExpanded){
                isDescriptionExpanded = false
                binding.ivExpandDescription.setImageResource(R.drawable.outline_expand_more_white_48)
                binding.tvDescription.text = boardGameViewModel.boardGameModel.value?.item?.shortDescription
            }else{
                isDescriptionExpanded = true
                binding.ivExpandDescription.setImageResource(R.drawable.outline_expand_less_white_48)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    binding.tvDescription.text = Html.fromHtml(boardGameViewModel.boardGameModel.value?.item?.description, Html.FROM_HTML_MODE_LEGACY).toString()
                }else{
                    binding.tvDescription.text = Html.fromHtml(boardGameViewModel.boardGameModel.value?.item?.description).toString()

                }
            }

        }


    }


    fun startTransition(){

        if(isDescriptionShowing){
            binding.viewContainer.post {
                val transition = ChangeBounds()
                transition.duration = 250
                TransitionManager.beginDelayedTransition(binding.viewContainer, transition)
                constraintSet1.applyTo(binding.viewContainer)


            }

        }else{

            binding.viewContainer.post {
                val transition = ChangeBounds()
                transition.duration = 250
                TransitionManager.beginDelayedTransition(binding.viewContainer, transition)
                constraintSet2.applyTo(binding.viewContainer)


            }

        }


      /*  ConstraintSet().apply {
            clone(binding.viewContainer);
            clone(context, R.layout.fragment_home_alt) // your transition
        }*/

    }

    fun toggleDescription(){
        isDescriptionShowing = !isDescriptionShowing
        if(isDescriptionShowing){
            binding.cvDescription.visibility = View.VISIBLE

        }else{
            binding.cvDescription.visibility = View.GONE

        }

    }




}