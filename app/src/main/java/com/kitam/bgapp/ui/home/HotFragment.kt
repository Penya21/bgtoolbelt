package com.kitam.bgapp.ui.home
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kitam.bgapp.MainActivity
import com.kitam.bgapp.data.data.BoardGame
import com.kitam.bgapp.model.BoardGameViewModel
import com.kitam.bgapp.R
import com.kitam.bgapp.databinding.FragmentHotBinding
import com.addisonelliott.segmentedbutton.SegmentedButtonGroup.OnPositionChangedListener
import com.kitam.bgapp.tools.isNull


class HotFragment : Fragment(), HotRecyclerAdapter.Callback {

    private lateinit var homeViewModel: HomeViewModel
    private val boardGameViewModel: BoardGameViewModel by activityViewModels()
    private var _binding:FragmentHotBinding? = null
    private val binding get() = _binding!!


    lateinit var mRecyclerView : RecyclerView
    val mAdapter : HotRecyclerAdapter = HotRecyclerAdapter()

    var isGrid = true


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHotBinding.inflate(inflater, container, false)

        //boardGameViewModel.onCreate()


        binding.ibListType.setOnClickListener{

            if(isGrid){
                binding.ibListType.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.outline_list_24))
                showList()
            }else{
                binding.ibListType.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.outline_grid_view_24))
                showGrid()
            }

            isGrid = !isGrid
        }

        binding.sbListType.onPositionChangedListener = OnPositionChangedListener {
            if(binding.sbListType.position == 1){
                if(!boardGameViewModel.upcomingGamesList.value.isNull()) {
                    setUpRecyclerView(boardGameViewModel.upcomingGamesList.value!!, true)
                }else{
                    boardGameViewModel.updateHotUpcomingList()
                }

            }else if(binding.sbListType.position == 0){
                if(!boardGameViewModel.hotGamesList.value.isNull()) {

                    setUpRecyclerView(boardGameViewModel.hotGamesList.value!!, false)
                }else{
                    boardGameViewModel.updateHotUpcomingList()

                }
            }else if(binding.sbListType.position == 2){
                if(!boardGameViewModel.topGamesList.value.isNull()) {

                    setUpRecyclerView(boardGameViewModel.topGamesList.value!!, false)
                }else{
                    boardGameViewModel.updateTopList()
                }

            }
        }




        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        boardGameViewModel.hotGamesList.observe(viewLifecycleOwner, Observer { list ->

            if(binding.sbListType.position == 0){
                setUpRecyclerView(list, false)
            }


        })

        boardGameViewModel.upcomingGamesList.observe(viewLifecycleOwner, Observer { list ->

            if(binding.sbListType.position == 1){
                setUpRecyclerView(list, true)
            }


        })

        boardGameViewModel.topGamesList.observe(viewLifecycleOwner, Observer { list ->

            if(binding.sbListType.position == 2){
                setUpRecyclerView(list, true)
            }


        })


        boardGameViewModel.isLoading.observe(viewLifecycleOwner, Observer {
            (activity as MainActivity).progressBar?.isVisible = it
        })

    }

    override fun onResume() {
        super.onResume()

    }

    fun setUpRecyclerView(mList:List<BoardGame>, showYear:Boolean){
        mRecyclerView = binding.rvHotList
        mAdapter.HotRecyclerAdapter(mList, requireContext(), this)
        mAdapter.showYear = showYear
        if(isGrid) {
            showGrid()
        }else{
            showList()
        }

    }



    private fun showList() {
        mRecyclerView.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        mAdapter.setLayoutResourceId(R.layout.item_hot_list)
        mRecyclerView.adapter = mAdapter


    }

    private fun showGrid() {
        mRecyclerView.layoutManager = GridLayoutManager(activity, 2)
        mAdapter.setLayoutResourceId(R.layout.item_hot_grid)
        mRecyclerView.adapter = mAdapter

    }

    override fun onBoardGameClicked(boardGame: BoardGame) {
        boardGameViewModel.boardGameDescription(boardGame.id)
        boardGameViewModel.selectedBoardGame.postValue(boardGame)
        this.findNavController().navigate(R.id.navigation_home)

    }

}