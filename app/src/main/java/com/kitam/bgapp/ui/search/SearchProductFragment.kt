package com.kitam.bgapp.ui.search

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.github.zawadz88.materialpopupmenu.popupMenu
import com.kitam.bgapp.R
import com.kitam.bgapp.data.data.Product
import com.kitam.bgapp.databinding.FragmentProductListBinding
import com.kitam.bgapp.model.BoardGameViewModel
import com.kitam.bgapp.tools.ZoomImageActivity
import com.kitam.bgapp.tools.hideKeyboard


/**
 * A fragment representing a list of Items.
 */
class SearchProductFragment : Fragment(), ProductRecyclerViewAdapter.Callback, AdapterView.OnItemSelectedListener {

    private var columnCount = 1
    private val boardGameViewModel: BoardGameViewModel by activityViewModels()
    private var _binding: FragmentProductListBinding? = null
    private val binding get() = _binding!!
    lateinit var mRecyclerView : RecyclerView
    lateinit var mAdapter : ProductRecyclerViewAdapter
    var mList: List<Product> = emptyList()
    var filterList = ArrayList<String>()
    var storeFilterList = ArrayList<String>()
    var isSearchBarModified:Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductListBinding.inflate(inflater, container, false)
        mRecyclerView = binding.list
        mRecyclerView.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        mAdapter = ProductRecyclerViewAdapter(mList, boardGameViewModel.storesList.value, requireContext(), this@SearchProductFragment)
        mRecyclerView.adapter = mAdapter

        binding.filterButton.setOnClickListener {
            binding.searchBar.clearFocus()
            onSingleSectionWithIconsClicked(it)
        }


        boardGameViewModel.searchProductsInStoresResult.observe(viewLifecycleOwner, { productList ->
            // Set the adapter
            if(productList.isEmpty()){
                binding.tvEmptyMessage.visibility = View.VISIBLE
                binding.filterButton.visibility = View.GONE
            }else{
                binding.tvEmptyMessage.visibility = View.GONE
                if(isSearchBarModified){
                    binding.filterButton.visibility = View.GONE

                }else {
                    binding.filterButton.visibility = View.VISIBLE
                }




                val distinctStores = productList.distinctBy{it.storeName}
                    .distinct()
                binding.searchBar.clearFocus()

                filterList.clear()
                storeFilterList.clear()

                filterList.add("Menor Precio")
                filterList.add("Mayor Precio")

                for(it in distinctStores){
                    if(!it.storeName.isNullOrEmpty())
                        storeFilterList.add(it.storeName!!)
                }




                //Spinner
                /*val aa = ArrayAdapter(requireContext(),R.layout.filter_spinner_item,list)
                binding.spinnerFilter.adapter = aa
                binding.spinnerFilter.onItemSelectedListener = this*/
            }
            mAdapter.update(productList)



        })

        boardGameViewModel.loadingText.observe(viewLifecycleOwner, {message ->
            try {
                binding.tvEmptyMessage.text = message
            }catch (e:Exception){

            }

        })

        binding.searchBar.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                if(!query.isNullOrBlank()) {
                    boardGameViewModel.searchProductsInStoresResult(query, true)
                    binding.tvEmptyMessage.visibility = View.GONE
                    boardGameViewModel.loadingText.postValue("No encontramos ningún resultado :(\n¡Prueba con otro juego!")
                }

                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }

        })

        return binding.root
    }

    override fun onResume() {
        super.onResume()
    }

    fun onSingleSectionWithIconsClicked(view: View) {
        val popupMenu = popupMenu {
            section {
                title = "Ordenar por:"


                item {
                    label = "Menor Precio"
                    callback = { //optional
                        mAdapter.revert(false)
                    }
                }

                item {
                    label = "Mayor Precio"
                    callback = { //optional
                        mAdapter.revert(true)
                        binding.searchBar.hideKeyboard()

                    }
                }



            }

            section {
                title = "Tiendas:"
                item {
                    label = "Todas"
                    callback = { //optional
                        mAdapter.filter.filter("")
                        binding.searchBar.hideKeyboard()

                    }
                }
                for(it in storeFilterList){
                    item {
                        label = it
                        callback = { //optional
                            mAdapter.filter.filter(it)
                            binding.searchBar.hideKeyboard()

                        }
                    }
                }


            }
        }

        popupMenu.show(requireContext(), view)
    }


    fun showSearchBar(boolean:Boolean){
        isSearchBarModified = true
        if(!boolean) {
            binding.searchBar.visibility = View.GONE
            binding.filterButton.visibility = View.GONE
        } else{
            binding.searchBar.visibility = View.VISIBLE

        }
    }

    fun showEmptyMessage(boolean:Boolean){
        if(!boolean) {
            binding.tvEmptyMessage.visibility = View.GONE
        } else{
            binding.tvEmptyMessage.visibility = View.VISIBLE
        }
    }

    fun setEmptyMessage(string: String){
        binding.tvEmptyMessage.text = string
    }



    companion object {

        // TODO: Customize parameter argument names
        const val ARG_COLUMN_COUNT = "column-count"

        // TODO: Customize parameter initialization
        @JvmStatic
        fun newInstance(columnCount: Int) =
            SearchProductFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COLUMN_COUNT, columnCount)
                }
            }
    }

    override fun onGoToStore(product: Product) {
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse(product.productRef)
        startActivity(openURL)
    }

    override fun onGoToMap(product: Product) {
        boardGameViewModel.selectedStoreName.postValue(product.storeName)
        this.findNavController().navigate(R.id.navigation_stores)

    }

    override fun onImageSelected(product: Product) {
        val intent = Intent(requireContext(), ZoomImageActivity::class.java)
        intent.putExtra("url",product.productImage)
        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        boardGameViewModel.searchProductsInStoresResult.postValue(emptyList())
        boardGameViewModel.loadingText.postValue("Comienza a buscar en las tiendas\ncercanas a ti.")

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        parent?.getItemAtPosition(position)


    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }
}