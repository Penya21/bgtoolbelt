package com.kitam.bgapp.ui.home


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.kitam.bgapp.data.data.BoardGame
import com.kitam.bgapp.R


class HotRecyclerAdapter : RecyclerView.Adapter<HotRecyclerAdapter.ViewHolder>() {

    var boardGames: List<BoardGame>  = ArrayList()
    var favGames: List<BoardGame> = ArrayList()
    lateinit var context: Context
    var layoutId: Int = R.layout.item_hot_grid
    private var callback: Callback? = null
    var showYear = false


    fun HotRecyclerAdapter(boardGames: List<BoardGame>, favGames : List<BoardGame>, context: Context, listener: Callback){
        this.boardGames = boardGames
        this.favGames = favGames
        this.context = context
        this.setListener(listener)
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


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = boardGames.get(position)
        var isFavorite = false
        if(favGames.contains(item))
            isFavorite = true
        holder.bind(item, position, context, callback, showYear, isFavorite)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(layoutId, parent, false))
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


        fun bind(boardGame: BoardGame, position: Int, context: Context, callback: Callback?, showYear:Boolean, isFavorite: Boolean){
            boardGameName.text = boardGame.name
            subtitle.text = boardGame.description
            year.text = boardGame.yearpublished
            if(!boardGame.rank.isNullOrEmpty())
              rank.text = "#" + boardGame.rank

            if(showYear){
                year.visibility = View.VISIBLE
                rank.visibility = View.GONE

            }else{
                rank.visibility = View.VISIBLE
                year.visibility = View.GONE
            }

            if(isFavorite){
                favButton.setBackgroundResource(R.drawable.circle_primary_color)
                favButton.setImageResource(R.drawable.ic_fav_on)
            }else{
                favButton.setBackgroundResource(R.drawable.circle_gray_color)
                favButton.setImageResource(R.drawable.ic_fav_off)
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





}


