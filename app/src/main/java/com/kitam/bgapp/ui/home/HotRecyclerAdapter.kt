package com.kitam.bgapp.ui.home


import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdLoader
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.nativead.NativeAd
import com.google.android.gms.ads.nativead.NativeAdOptions
import com.google.android.gms.ads.nativead.NativeAdView
import com.kitam.bgapp.R
import com.kitam.bgapp.data.data.BoardGame





class HotRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var boardGames: List<BoardGame>  = ArrayList()
    var favGames: List<BoardGame> = ArrayList()
    lateinit var context: Context
    var layoutId: Int = R.layout.item_hot_grid
    private var callback: Callback? = null
    var showYear = false
    var showRank = false
    val AD_TYPE = 1
    val CONTENT_TYPE = 2
    var adPos = 15


    fun HotRecyclerAdapter(boardGames: List<BoardGame>, favGames : List<BoardGame>, context: Context, listener: Callback){
        this.favGames = favGames
        this.context = context
        this.setListener(listener)

        val boardGamesWithAdsList: MutableList<BoardGame> = ArrayList()
        if (!boardGames.isNullOrEmpty()) {
            var counter = 0
            //iterate through the actual data list and prepare the new articlesWithAdsList
            for (i in boardGames) {
                //initialize and add the ad in every 3rd row
                if (counter == this.adPos) {
                    val advertise = BoardGame()
                    advertise.isAd = true
                    boardGamesWithAdsList.add(advertise)
                    counter = 0
                }
                //and add the actual Item ArticleJson object
                val boardGame: BoardGame = i
                boardGame.isAd = false
                boardGamesWithAdsList.add(boardGame)
                counter++
            }
        }
        //articleList now have both ads and data items
        //articleList now have both ads and data items
        this.boardGames = boardGamesWithAdsList


    }

    interface Callback {
        fun onBoardGameClicked(boardGame:BoardGame)
        fun onFavBoardGameClicked(boardGame:BoardGame, position: Int, isFavorite: Boolean)

    }


    fun setListener(listener: Callback) {
        callback = listener
    }

    fun setLayoutResourceId(layoutId: Int) {
        this.layoutId = layoutId
    }

    override fun getItemViewType(position: Int): Int {

        val boardGame: BoardGame = boardGames[position]
        return if (boardGame.isAd!!) {
            AD_TYPE
        } else {
            CONTENT_TYPE
        }

    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (getItemViewType(position) == CONTENT_TYPE) {

            if(holder is ViewHolder){
                val item = boardGames.get(position)
                var isFavorite = false
                if(favGames.any { it.name == item.name }){
                    isFavorite = true

                }


                holder.bind(item, position, context, callback, showYear, showRank, isFavorite)
            }

        }else {
            if (holder is ViewHolderAd) {
                val adLoader =
                    AdLoader.Builder(this.context, "ca-app-pub-6862253449696844/5356628649")
                        .forNativeAd { ad: NativeAd ->
                            /*   // Show the ad.
                    if (adLoader.isLoading) {
                        // The AdLoader is still loading ads.
                        // Expect more adLoaded or onAdFailedToLoad callbacks.
                    } else {
                        // The AdLoader has finished loading ads.
                    }

                    if(isDestroyed){
                        ad.destroy()
                        return@forNativeAd
                    }*/
                            holder.bind(context, ad.images[0].drawable, ad.headline)
                        }
                        .withAdListener(object : AdListener() {
                            override fun onAdFailedToLoad(adError: LoadAdError) {
                                // Handle the failure by logging, altering the UI, and so on.
                                holder.backgroundAd.setBackgroundResource(R.color.colorPrimary)
                                holder.bind(context, context.resources.getDrawable(R.drawable.dice_detailed, null), "BG Hunter")


                            }
                        })
                        .withNativeAdOptions(
                            NativeAdOptions.Builder()
                                // Methods in the NativeAdOptions.Builder class can be
                                // used here to specify individual options settings.
                                .build()
                        )

                        .build()
                adLoader.loadAds(AdRequest.Builder().build(), 1)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return if (viewType === AD_TYPE) {
            ViewHolderAd(layoutInflater.inflate(R.layout.item_hot_grid_ad, parent, false))
        } else {
            ViewHolder(layoutInflater.inflate(layoutId, parent, false))
        }

    }

    override fun getItemCount(): Int {
        return boardGames.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val boardGameName = view.findViewById(R.id.tvTitle) as TextView
        val subtitle = view.findViewById(R.id.tvSubtitle) as TextView
        val year = view.findViewById(R.id.tvYear) as TextView
        val rank = view.findViewById(R.id.tvRank) as TextView
        val avatar = view.findViewById(R.id.ivImage) as ImageView
        val favButton = view.findViewById(R.id.ivFav) as ImageView


        fun bind(boardGame: BoardGame, position: Int, context: Context, callback: Callback?, showYear:Boolean, showRank:Boolean, isFavorite: Boolean){
            boardGameName.text = boardGame.name
            subtitle.text = boardGame.description
            year.text = boardGame.yearpublished
            if(!boardGame.rank.isNullOrEmpty())
              rank.text = "#" + boardGame.rank

            if(showYear){
                year.visibility = View.VISIBLE

            }else{
                year.visibility = View.GONE
            }

            if(showRank){
                rank.visibility = View.VISIBLE
            }else{
                rank.visibility = View.GONE

            }

            if(isFavorite){
                favButton.setBackgroundResource(R.drawable.circle_primary_color)
                favButton.setImageResource(R.drawable.outline_favorite_24)
            }else{
                favButton.setBackgroundResource(R.drawable.circle_gray_color)
                favButton.setImageResource(R.drawable.outline_favorite_border_24)
            }


            itemView.setOnClickListener(View.OnClickListener {


               /* Toast.makeText(
                    context, boardGame.nameList?.get(
                        0
                    )?.value, Toast.LENGTH_SHORT
                ).show()*/
                callback?.onBoardGameClicked(boardGame)


            })

            favButton.setOnClickListener(View.OnClickListener {

                callback?.onFavBoardGameClicked(boardGame, position, isFavorite)

            })
            //avatar.load(boardGame.thumbnail?.value.toString())

             Glide.with(context).load(boardGame.imageurl).transition(DrawableTransitionOptions.withCrossFade(250)).error(R.drawable.splash_background).into(avatar)
            //Picasso.with(context).load(boardGame.thumbnail?.value.toString()).into(avatar)


        }

    }


    class ViewHolderAd(view: View) : RecyclerView.ViewHolder(view) {

        val nativeAdView:NativeAdView = view.findViewById(R.id.navMain) as NativeAdView
        val backgroundAd:ConstraintLayout = view.findViewById(R.id.background_ad) as ConstraintLayout
        val imageView:ImageView = view.findViewById(R.id.ad_app_icon) as ImageView
        val textView:TextView = view.findViewById(R.id.ad_headline) as TextView

        fun bind(context:Context, image: Drawable, headline:String){

            textView.text = headline
            Glide.with(context).load(image).transition(DrawableTransitionOptions.withCrossFade(250)).error(R.drawable.splash_background).into(imageView)


        }

    }


}


