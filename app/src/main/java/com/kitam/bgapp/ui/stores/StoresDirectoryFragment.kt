package com.kitam.bgapp.ui.stores

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.kitam.bgapp.R
import com.kitam.bgapp.data.data.Store
import com.kitam.bgapp.databinding.FragmentSearchListBinding
import com.kitam.bgapp.model.BoardGameViewModel
import com.kitam.bgapp.tools.isNull

/**
 * A fragment representing a list of Items.
 */
class StoresDirectoryFragment : Fragment(), OnMapReadyCallback, StoresDirectoryRecyclerViewAdapter.Callback {

    private var columnCount = 2
    private var _binding: FragmentSearchListBinding? = null
    private val boardGameViewModel: BoardGameViewModel by activityViewModels()
    private val binding get() = _binding!!
    val mAdapter : StoresDirectoryRecyclerViewAdapter = StoresDirectoryRecyclerViewAdapter()
    var callback : StoresDirectoryRecyclerViewAdapter.Callback = this
    lateinit var googleMap: GoogleMap

    var stores: List<Store> = emptyList()
    var markers: MutableList<Marker?> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            columnCount = it.getInt(ARG_COLUMN_COUNT)
        }


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSearchListBinding.inflate(inflater, container, false)

        val mapFragment = SupportMapFragment.newInstance()
        parentFragmentManager
            .beginTransaction()
            .add(R.id.container, mapFragment)
            .commit()

        boardGameViewModel.storesList.observe(viewLifecycleOwner, {
            if(!it.isNullOrEmpty()){
                stores = it
                if (binding.list is RecyclerView) {
                    with(binding.list) {
                        layoutManager = when {
                            columnCount <= 1 -> LinearLayoutManager(context)
                            else -> GridLayoutManager(context, columnCount)
                        }
                        mAdapter.MyBoardGameSearchRecyclerViewAdapter(stores, requireContext(), callback)
                        adapter = mAdapter

                    }

                }
            }
        })
        mapFragment.getMapAsync(this)




        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    companion object {

        // TODO: Customize parameter argument names
        const val ARG_COLUMN_COUNT = "column-count"

        // TODO: Customize parameter initialization
        @JvmStatic
        fun newInstance(columnCount: Int) =
            StoresDirectoryFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COLUMN_COUNT, columnCount)
                }
            }
    }

    override fun onMapReady(googleMap: GoogleMap) {

        this.googleMap = googleMap

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(19.43175, -99.13625), 11.0f))

        for (i in stores) {
            var marker:Marker? = googleMap.addMarker(
                MarkerOptions()
                    .position(i.coordinates)
                    .title(i.name)
                    .snippet(i.website)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))

            )

            markers.add(marker)
        }
        googleMap.setOnInfoWindowClickListener { marker ->
            try {
                val openURL = Intent(Intent.ACTION_VIEW)
                openURL.data = Uri.parse(marker.snippet.toString())
                startActivity(openURL)
            }catch(e:Exception){

            }
        }


        boardGameViewModel.selectedStoreName.observe(viewLifecycleOwner, { storeName ->

            if(!storeName.isNullOrEmpty()){
                try{
                    val found = stores.find { it.name == storeName }



                    if(!found.isNull()) {

                        for (marker in markers) {
                            if(found!!.name == marker?.title){
                                marker.showInfoWindow()
                                googleMap.uiSettings.isMapToolbarEnabled = true;

                            }
                        }


                        this.googleMap.animateCamera(
                            CameraUpdateFactory.newLatLngZoom(
                                found!!.coordinates,
                                15.0f
                            )
                        );
                    }

                }catch (e: Exception){

                }
            }
        })

    }



    override fun onStoreClicked(store: Store) {
        for (marker in markers) {
            if(store.name == marker?.title){
                marker.showInfoWindow()
                googleMap.uiSettings.isMapToolbarEnabled = true;

            }
        }

        this.googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(store.coordinates, 15.0f));

    }


    override fun onFavStoreClicked(store: Store, position: Int) {
    }

    override fun onWebsiteClicked(store: Store) {
    }
}