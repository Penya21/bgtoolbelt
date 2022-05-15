package com.kitam.bgapp.ui.favorites

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.kitam.bgapp.data.data.BoardGame
import com.kitam.bgapp.R
import java.util.*
import kotlin.collections.ArrayList


class FavRecyclerAdapter : RecyclerView.Adapter<FavRecyclerAdapter.ViewHolder>(), Filterable {

    var boardGames: List<BoardGame>  = ArrayList()
    lateinit var context: Context
    var layoutId: Int = R.layout.item_favorite
    private var callback: Callback? = null
    var showYear = false
    var filterList : List<BoardGame> = ArrayList()


    fun FavRecyclerAdapter(boardGames: List<BoardGame>, context: Context, listener: Callback){
        this.boardGames = boardGames
        this.context = context
        this.setListener(listener)
        filterList = boardGames




    }

    interface Callback {
        fun onBoardGameClicked(boardGame:BoardGame)
        fun onFavBoardGameClicked(boardGame:BoardGame, position: Int)
        fun onShareBoardGameClicked(boardGame:BoardGame, position: Int)

    }


    fun setListener(listener: Callback) {
        callback = listener
    }

    fun setLayoutResourceId(layoutId: Int) {
        this.layoutId = layoutId
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = filterList.get(position)
        holder.bind(item, position, context, callback)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(layoutId, parent, false))
    }

    override fun getItemCount(): Int {
        return filterList.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val boardGameName = view.findViewById(R.id.tvTitle) as TextView
        val avatar = view.findViewById(R.id.ivImage) as ImageView
        val favButton = view.findViewById(R.id.ivFav) as ImageView
        val shareButton = view.findViewById(R.id.ivShare) as ImageView


        fun bind(boardGame: BoardGame, position: Int, context: Context, callback: Callback?){
            boardGameName.text = boardGame.name


            favButton.setOnClickListener {
                callback?.onFavBoardGameClicked(boardGame, position)

            }

            shareButton.setOnClickListener {
                callback?.onShareBoardGameClicked(boardGame, position)

            }

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
        filterList = boardGames
        notifyDataSetChanged()
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charSearch = constraint.toString()
                if (charSearch.isEmpty()) {
                    filterList = boardGames
                } else {
                    val resultList = ArrayList<BoardGame>()
                    for (row in boardGames) {
                        try {
                            if (row.name!!.lowercase(Locale.ROOT).contains(charSearch.lowercase(Locale.ROOT))) {
                                resultList.add(row)
                            }
                        }catch (e:Exception){

                        }

                    }
                    filterList = resultList
                }
                val filterResults = FilterResults()
                filterResults.values = filterList
                return filterResults
            }

            @Suppress("UNCHECKED_CAST")
            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                try {
                    filterList = results?.values as ArrayList<BoardGame>
                    notifyDataSetChanged()
                }catch (e:Exception){
                    filterList = boardGames
                    notifyDataSetChanged()

                }

            }

        }
    }


}


