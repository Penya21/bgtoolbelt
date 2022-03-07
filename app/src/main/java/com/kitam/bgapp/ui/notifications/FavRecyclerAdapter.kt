package com.kitam.bgapp.ui.notifications

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


class FavRecyclerAdapter : RecyclerView.Adapter<FavRecyclerAdapter.ViewHolder>() {

    var boardGames: List<BoardGame>  = ArrayList()
    lateinit var context: Context
    var layoutId: Int = R.layout.item_favorite
    private var callback: Callback? = null
    var showYear = false


    fun FavRecyclerAdapter(boardGames: List<BoardGame>, context: Context, listener: Callback){
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
        holder.bind(item, position, context, callback)
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
        val avatar = view.findViewById(R.id.ivImage) as ImageView


        fun bind(boardGame: BoardGame, position: Int, context: Context, callback: Callback?){
            boardGameName.text = boardGame.name




            itemView.setOnClickListener(View.OnClickListener {


                /* Toast.makeText(
                     context, boardGame.nameList?.get(
                         0
                     )?.value, Toast.LENGTH_SHORT
                 ).show()*/
                callback?.onBoardGameClicked(boardGame)


            })


            //avatar.load(boardGame.thumbnail?.value.toString())

            Glide.with(context).load(boardGame.imageurl).transition(DrawableTransitionOptions.withCrossFade(250)).error(R.drawable.splash_background).into(avatar)
            //Picasso.with(context).load(boardGame.thumbnail?.value.toString()).into(avatar)


        }

    }


    fun update(modelList:List<BoardGame>){
        boardGames = modelList
        notifyDataSetChanged()
    }


}


