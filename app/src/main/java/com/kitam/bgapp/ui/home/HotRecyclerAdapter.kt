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
    lateinit var context: Context
    var layoutId: Int = R.layout.item_hot_grid
    private var callback: Callback? = null
    var showYear = false


    fun HotRecyclerAdapter(boardGames: List<BoardGame>, context: Context, listener: Callback){
        this.boardGames = boardGames
        this.context = context
        this.setListener(listener)
    }

    interface Callback {
        fun onBoardGameClicked(boardGame:BoardGame)
    }


    fun setListener(listener: Callback) {
        callback = listener
    }

    fun setLayoutResourceId(layoutId: Int) {
        this.layoutId = layoutId
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = boardGames.get(position)
        holder.bind(item, context, callback, showYear)
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
        val avatar = view.findViewById(R.id.ivImage) as ImageView
        val favButton = view.findViewById(R.id.ivFav) as ImageView


        fun bind(boardGame: BoardGame, context: Context, callback: Callback?, showYear:Boolean){
            boardGameName.text = boardGame.name
            subtitle.text = boardGame.description
            year.text = boardGame.yearpublished

            if(showYear){
                year.visibility = View.VISIBLE

            }else{
                year.visibility = View.GONE

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

              //  favButton.setBackgroundResource(R.drawable.circle_primary_color)
              //  favButton.setImageResource(R.drawable.ic_fav_on)

            })
            //avatar.load(boardGame.thumbnail?.value.toString())

             Glide.with(context).load(boardGame.imageurl).transition(DrawableTransitionOptions.withCrossFade(250)).error(R.drawable.splash_background).into(avatar)
            //Picasso.with(context).load(boardGame.thumbnail?.value.toString()).into(avatar)


        }

    }





}


