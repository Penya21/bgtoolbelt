package com.kitam.bgapp.ui.stores

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.kitam.bgapp.R
import com.kitam.bgapp.data.data.Store
import com.kitam.bgapp.databinding.FragmentSearchBinding

import com.kitam.bgapp.ui.stores.placeholder.PlaceholderContent.PlaceholderItem

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class StoresDirectoryRecyclerViewAdapter(
 ) : RecyclerView.Adapter<StoresDirectoryRecyclerViewAdapter.ViewHolder>() {

    lateinit var context: Context
    private var callback: Callback? = null
    private var values: List<Store> = ArrayList()


    fun MyBoardGameSearchRecyclerViewAdapter(stores: List<Store>, context: Context, listener: Callback){
        this.values = stores
        this.context = context
        this.setListener(listener)

    }


    fun setListener(listener: Callback) {
        callback = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentSearchBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        var temp: Int = position + 1
        holder.idView.text = "" + temp
        holder.contentView.text = item.name
        holder.websiteView.text = item.website
        if(item.logo != 0) {
            holder.logo.visibility = View.VISIBLE
            holder.contentView.visibility = View.GONE
            Glide.with(context).load(item.logo)
                .transition(DrawableTransitionOptions.withCrossFade(250))
                .error(R.drawable.outline_storefront_white_48).into(holder.logo)
        }else{
            holder.logo.visibility = View.GONE
            holder.contentView.visibility = View.VISIBLE
        }
        holder.websiteView.setOnClickListener {
            callback?.onWebsiteClicked(item)
        }

        holder.logo.setOnClickListener {
            callback?.onStoreClicked(item)

        }

        holder.itemView.setOnClickListener {
            callback?.onStoreClicked(item)
        }

    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentSearchBinding) : RecyclerView.ViewHolder(binding.root) {
        val idView: TextView = binding.itemNumber
        val contentView: TextView = binding.content
        val websiteView: TextView = binding.website
        val logo: ImageView = binding.logo


        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }

    interface Callback {
        fun onStoreClicked(store:Store)
        fun onFavStoreClicked(store:Store, position: Int)
        fun onWebsiteClicked(store:Store)

    }

}