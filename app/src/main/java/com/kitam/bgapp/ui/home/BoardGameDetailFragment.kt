package com.kitam.bgapp.ui.home
import android.content.Intent
import android.graphics.drawable.Drawable
import android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.transition.ChangeBounds
import androidx.transition.TransitionManager
import com.addisonelliott.segmentedbutton.SegmentedButtonGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.kitam.bgapp.MainActivity
import com.kitam.bgapp.model.BoardGameViewModel
import com.kitam.bgapp.R
import com.kitam.bgapp.data.data.BoardGame
import com.kitam.bgapp.databinding.FragmentBoardgameDetailBinding
import com.kitam.bgapp.tools.ZoomImageActivity
import com.kitam.bgapp.tools.isNull
import com.kitam.bgapp.ui.search.SearchProductFragment
import io.github.muddz.styleabletoast.StyleableToast

class BoardGameDetailFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private val boardGameViewModel: BoardGameViewModel by activityViewModels()
    private var _binding: FragmentBoardgameDetailBinding? = null
    private val binding get() = _binding!!
    var isDescriptionShowing = true
    var shareLink = ""
    var firstLoad = true
    var isDescriptionExpanded = true;
    val constraintSet1 = ConstraintSet()
    val constraintSet2 = ConstraintSet()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBoardgameDetailBinding.inflate(inflater, container, false)

        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {

        })
        boardGameViewModel.boardGameDescription(boardGameViewModel.selectedBoardGame.value!!.id)

        boardGameViewModel.loadingText.postValue("Buscando...")
        //boardGameViewModel.onCreate()
        firstLoad = true
       // (activity as MainActivity).showBottomNavigationMenu()
        activity


        binding.sbListType.onPositionChangedListener =
            SegmentedButtonGroup.OnPositionChangedListener {
                switchDetail(it)
            }

        constraintSet1.clone(binding.viewContainer)
        constraintSet2.clone(context, R.layout.fragment_boardgame_detail_alt)

        return binding.root
    }

    fun switchDetail(position:Int){

        if(position == 1){
            if(!boardGameViewModel.upcomingGamesList.value.isNull()) {
                //(activity as MainActivity).hideBottomNavigationMenu()

                binding.tvAuthor.visibility = View.GONE
                binding.tvYear.visibility = View.GONE
                binding.tvRank.visibility = View.GONE
                binding.llTags.visibility = View.GONE
                binding.cvTextDescription.visibility = View.GONE
                binding.fcvProductFragment.visibility = View.VISIBLE
                binding.fcvProductFragment.getFragment<SearchProductFragment>().showSearchBar(false)

            }

        }else if(position == 0){
            if(!boardGameViewModel.hotGamesList.value.isNull()) {
                (activity as MainActivity).showBottomNavigationMenu()
                binding.tvAuthor.visibility = View.VISIBLE
                binding.tvYear.visibility = View.VISIBLE
                binding.tvRank.visibility = View.VISIBLE
                binding.llTags.visibility = View.VISIBLE
                binding.fcvProductFragment.visibility = View.VISIBLE
                binding.cvTextDescription.visibility = View.VISIBLE
                binding.fcvProductFragment.visibility = View.GONE


            }
        }

    }

    override fun onResume() {
        super.onResume()

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

            if(boardGameViewModel.favGamesList.value?.contains(selectedBoardGame) == true){
                binding.ivFav.setBackgroundResource(R.drawable.circle_primary_color)
                binding.ivFav.setImageResource(R.drawable.outline_favorite_24)
            }else{
                binding.ivFav.setBackgroundResource(R.drawable.circle_gray_color)
                binding.ivFav.setImageResource(R.drawable.outline_favorite_border_24)
            }

            binding.ivFav.setOnClickListener {
                onFavBoardGameClicked(selectedBoardGame)
            }

            binding.ivShare.setOnClickListener {
                onShareBoardGameClicked(selectedBoardGame)
            }

            var formattedName = selectedBoardGame.name!!
            if(selectedBoardGame.name!!.contains(":")){
                formattedName = selectedBoardGame.name!!.split(":")[0]
            }

            if(formattedName.contains("Legacy")){
                formattedName = formattedName.replace("Legacy", "")
            }

            boardGameViewModel.loadingText.postValue("Buscando...")

            boardGameViewModel.searchProductsInStoresResult(formattedName, false)

        })



        boardGameViewModel.searchProductsInStoresResult.observe(viewLifecycleOwner, { productList ->

            if(productList.isEmpty()){
                boardGameViewModel.loadingText.postValue("No encontramos este juego en ninguna tienda cercana a ti, pero agrégalo a tus favoritos y te notificaremos cuando esté disponbile.")

            }else{

            }

        })




        boardGameViewModel.boardGameModel.observe(viewLifecycleOwner, Observer { currentBoardGame ->



            binding.tvHome.text = currentBoardGame.item?.name
            binding.ivShare.visibility = View.VISIBLE
            binding.ivFav.visibility = View.VISIBLE
            binding.sbListType.visibility = View.VISIBLE

            if(currentBoardGame.item?.href.isNullOrEmpty()){
                shareLink = ""
            }else {
                shareLink = "https://boardgamegeek.com" + currentBoardGame.item?.href
            }


            if(!boardGameViewModel.boardGameModel.value?.item?.shortDescription.isNullOrEmpty()){
                binding.cvTextDescription.visibility = View.VISIBLE
            }

            if(!isDescriptionExpanded){
                binding.ivExpandDescription.setImageResource(R.drawable.outline_expand_more_white_48)
                binding.tvDescription.text = boardGameViewModel.boardGameModel.value?.item?.shortDescription
            }else{
                binding.ivExpandDescription.setImageResource(R.drawable.outline_expand_less_white_48)

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    binding.tvDescription.text = Html.fromHtml(boardGameViewModel.boardGameModel.value?.item?.description, Html.FROM_HTML_MODE_LEGACY).toString()
                }else{
                    binding.tvDescription.text = Html.fromHtml(boardGameViewModel.boardGameModel.value?.item?.description).toString()

                }
            }

            if(!currentBoardGame.item?.links?.boardgameartist.isNullOrEmpty()) {
                binding.tvAuthor.text = "Autor(a): " + currentBoardGame.item?.links!!.boardgamedesigner[0].name
            }else{
                binding.tvAuthor.visibility = View.GONE
            }

            if(!currentBoardGame.item?.rankinfo.isNullOrEmpty() && !currentBoardGame.item!!.rankinfo[0].rank.isNullOrEmpty() && !currentBoardGame.item!!.rankinfo[0].rank.equals("0")) {
                binding.tvRank.text = "Posición: #" + currentBoardGame.item!!.rankinfo[0].rank
            }else{
                binding.tvRank.visibility = View.GONE
            }
            if(!currentBoardGame.item?.yearpublished.isNullOrEmpty() && currentBoardGame.item?.yearpublished != "0") {
                binding.tvYear.text = "Año: " + currentBoardGame.item?.yearpublished
            }else{
                binding.tvYear.visibility = View.GONE
            }
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

            if(!currentBoardGame.item?.topimageurl.isNullOrEmpty())
                imageList.add(SlideModel(currentBoardGame.item?.topimageurl))
            if(!boardGameViewModel.selectedBoardGame.value?.imageurl.isNullOrEmpty())
                imageList.add(SlideModel(boardGameViewModel.selectedBoardGame.value?.imageurl))
            if(!currentBoardGame.item?.imageSets?.mediacard?.src2x.isNullOrEmpty())
                imageList.add(SlideModel(currentBoardGame.item?.imageSets?.mediacard?.src2x))


            binding.imageSlider.setImageList(imageList)

            binding.imageSlider.visibility = View.VISIBLE
            binding.ivImage.visibility = View.GONE

            binding.imageSlider.setItemClickListener(object : ItemClickListener {
                override fun onItemSelected(position: Int) {
                    val intent = Intent(requireContext(), ZoomImageActivity::class.java)
                    intent.putExtra("url",imageList.get(position).imageUrl)
                    startActivity(intent)
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

    fun onFavBoardGameClicked(boardGame: BoardGame) {

        if(boardGameViewModel.favGamesList.value?.contains(boardGame) == true){
            boardGameViewModel.removeFavorite(boardGame)
            binding.ivFav.setBackgroundResource(R.drawable.circle_gray_color)
            binding.ivFav.setImageResource(R.drawable.outline_favorite_border_24)

        }else{
            boardGameViewModel.addFavorite(boardGame)
            binding.ivFav.setBackgroundResource(R.drawable.circle_primary_color)
            binding.ivFav.setImageResource(R.drawable.outline_favorite_24)
        }

       // StyleableToast.makeText(requireContext(), "Se removió " + boardGame.name + " de tus favoritos.", Toast.LENGTH_SHORT, R.style.mytoast).show();

    }

    fun onShareBoardGameClicked(boardGame: BoardGame) {
        val shareIntent = Intent()
        shareIntent.action = Intent.ACTION_SEND
        shareIntent.type =  "text/plain"
        if(shareLink.isNullOrEmpty()){
            shareLink = boardGame.imageurl!!
        }
        shareIntent.putExtra(Intent.EXTRA_TEXT, "¡Este es el juego!\n\n" + boardGame.name + "\n\n" + shareLink)
        startActivity(Intent.createChooser(shareIntent, "Compartir en"))

    }





}