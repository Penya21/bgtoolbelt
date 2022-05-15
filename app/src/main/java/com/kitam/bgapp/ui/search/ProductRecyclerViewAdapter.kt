package com.kitam.bgapp.ui.search

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.kitam.bgapp.R
import com.kitam.bgapp.data.data.BoardGame
import com.kitam.bgapp.data.data.Product
import com.kitam.bgapp.data.data.Store
import com.kitam.bgapp.databinding.FragmentProductBinding

import com.kitam.bgapp.ui.search.placeholder.PlaceholderContent.PlaceholderItem
import java.util.*
import kotlin.collections.ArrayList

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class ProductRecyclerViewAdapter(
    private var values: List<Product>, private val stores: List<Store>?, private val context: Context, private val callback: Callback
) : RecyclerView.Adapter<ProductRecyclerViewAdapter.ViewHolder>(), Filterable {

    var filterList : List<Product> = values
    var isReversed : Boolean = false

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentProductBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    interface Callback {
        fun onGoToStore(product: Product)
        fun onGoToMap(product: Product)
        fun onImageSelected(product: Product)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = filterList[position]
        holder.title.text = item.productName
        holder.store.text = item.storeName
        holder.price.text = item.priceText
        Glide.with(context).load(item.productImage).transition(DrawableTransitionOptions.withCrossFade(250)).error(R.drawable.splash_background).into(holder.image)

        if(!stores.isNullOrEmpty()) {

            val foundStores : List<Store> = stores.filter { it.name == item.storeName }

            if (foundStores.isNotEmpty()) {
                Glide.with(context).load(foundStores[0].logo).transition(DrawableTransitionOptions.withCrossFade(250)).error(R.drawable.dice_detailed).into(holder.storeImage)

            }else{
                holder.storeImage.visibility = View.GONE

            }
        }else{
            holder.storeImage.visibility = View.GONE
        }


        holder.buttonMap.setOnClickListener {
            callback.onGoToMap(item)
        }

        holder.itemView.setOnClickListener {
            callback.onGoToStore(item)
        }

        holder.image.setOnClickListener {
            callback.onImageSelected(item)
        }
    }


    fun revert(boolean:Boolean){


        if(boolean) {

            if(isReversed){

            }else{
                values = values.reversed()
                filterList = values
                isReversed = true
                notifyDataSetChanged()
            }

        }else{
            if(isReversed){
                values = values.reversed()
                filterList = values
                isReversed = false
                notifyDataSetChanged()
            }else{

            }
        }


    }

    fun update(list:List<Product>){
        values = list
        filterList = values
        notifyDataSetChanged()
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charSearch = constraint.toString()
                if (charSearch.isEmpty()) {
                    filterList = values
                } else {
                    val resultList = ArrayList<Product>()
                    for (row in values) {
                        try {
                            if (row.storeName!!.lowercase(Locale.ROOT).contains(charSearch.lowercase(
                                    Locale.ROOT))) {
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
                    filterList = results?.values as ArrayList<Product>
                    notifyDataSetChanged()
                }catch (e:Exception){
                    filterList = values
                    notifyDataSetChanged()

                }

            }

        }
    }

    override fun getItemCount(): Int {
        return filterList.size
    }
    inner class ViewHolder(binding: FragmentProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val title: TextView = binding.tvTitle
        val store: TextView = binding.tvStore
        val storeImage: ImageView = binding.ivStore;
        val price: TextView = binding.tvPrice
        val image: ImageView = binding.ivImage
        val buttonMap: ImageView = binding.ivGoToMap
        val buttonStore: ImageView = binding.ivGoToStore

        override fun toString(): String {
            return super.toString()
        }
    }

}