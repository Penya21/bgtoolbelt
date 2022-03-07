package com.kitam.bgapp.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kitam.bgapp.R
import com.kitam.bgapp.data.data.BoardGame
import com.kitam.bgapp.databinding.FragmentHotBinding
import com.kitam.bgapp.databinding.FragmentNotificationsBinding
import com.kitam.bgapp.model.BoardGameViewModel
import com.kitam.bgapp.ui.home.HotRecyclerAdapter

class NotificationsFragment : Fragment(), FavRecyclerAdapter.Callback {

    private lateinit var notificationsViewModel: NotificationsViewModel
    private val boardGameViewModel: BoardGameViewModel by activityViewModels()
    private var _binding: FragmentNotificationsBinding? = null
    private val binding get() = _binding!!
    lateinit var mRecyclerView : RecyclerView
    val mAdapter : FavRecyclerAdapter = FavRecyclerAdapter()
    var mList : List<BoardGame> = emptyList()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mRecyclerView = binding.rvHotList
        mRecyclerView.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        mAdapter.FavRecyclerAdapter(mList, requireContext(), this)
        mAdapter.setLayoutResourceId(R.layout.item_favorite)
        mRecyclerView.adapter = mAdapter
        boardGameViewModel.favGamesList.observe(viewLifecycleOwner, {
            if(it != null){
                mAdapter.update(it)
            }

        })


    }

    fun updateList(list:List<BoardGame>){
        mList = list
        mAdapter.notifyDataSetChanged()

    }

    override fun onBoardGameClicked(boardGame: BoardGame) {

    }
}