package com.kitam.bgapp.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kitam.bgapp.R
import com.kitam.bgapp.databinding.FragmentSearchBinding
import com.kitam.bgapp.databinding.FragmentSearchListBinding
import com.kitam.bgapp.databinding.ProfileFragmentBinding
import com.kitam.bgapp.ui.search.placeholder.PlaceholderContent

/**
 * A fragment representing a list of Items.
 */
class SearchFragment : Fragment() {

    private var columnCount = 1
    private var _binding: FragmentSearchListBinding? = null
    private val binding get() = _binding!!


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

        // Set the adapter
        if (binding.list is RecyclerView) {
            with(binding.list) {
                layoutManager = when {
                    columnCount <= 1 -> LinearLayoutManager(context)
                    else -> GridLayoutManager(context, columnCount)
                }
                adapter = MyBoardGameSearchRecyclerViewAdapter(PlaceholderContent.ITEMS)
            }
        }
        return binding.root
    }

    companion object {

        // TODO: Customize parameter argument names
        const val ARG_COLUMN_COUNT = "column-count"

        // TODO: Customize parameter initialization
        @JvmStatic
        fun newInstance(columnCount: Int) =
            SearchFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COLUMN_COUNT, columnCount)
                }
            }
    }
}