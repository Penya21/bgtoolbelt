package com.kitam.bgapp.ui.favorites

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kitam.bgapp.R
import com.kitam.bgapp.data.data.BoardGame
import com.kitam.bgapp.databinding.FragmentNotificationsBinding
import com.kitam.bgapp.model.BoardGameViewModel
import io.github.muddz.styleabletoast.StyleableToast

class FavoritesFragment : Fragment(), FavRecyclerAdapter.Callback {

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
        mRecyclerView.layoutManager = GridLayoutManager(activity, 3)
        mAdapter.FavRecyclerAdapter(mList, requireContext(), this)
        mAdapter.setLayoutResourceId(R.layout.item_favorite)
        mRecyclerView.adapter = mAdapter
        boardGameViewModel.favGamesList.observe(viewLifecycleOwner, {
            if(it != null){
                if(it.isNullOrEmpty()) {
                    binding.tvEmptyMessage.visibility = View.VISIBLE;
                }else{
                    binding.tvEmptyMessage.visibility = View.GONE;

                }

                mAdapter.update(it)
            }

        })

        binding.searchBar.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                mAdapter.filter.filter(newText)
                return false
            }

        })


    }

    fun updateList(list:List<BoardGame>){
        mList = list
        mAdapter.notifyDataSetChanged()

    }

    override fun onBoardGameClicked(boardGame: BoardGame) {
          //  boardGameViewModel.boardGameDescription(boardGame.id)
            boardGameViewModel.selectedBoardGame.postValue(boardGame)
            this.findNavController().navigate(R.id.navigation_home)
    }

    override fun onFavBoardGameClicked(boardGame: BoardGame, position:Int) {

        boardGameViewModel.removeFavorite(boardGame)
        StyleableToast.makeText(requireContext(), "Se removió " + boardGame.name + " de tus favoritos.", Toast.LENGTH_SHORT, R.style.mytoast).show();

    }

    override fun onShareBoardGameClicked(boardGame: BoardGame, position: Int) {
        val shareIntent = Intent()
        shareIntent.action = Intent.ACTION_SEND
        shareIntent.type =  "text/plain"
        shareIntent.putExtra(Intent.EXTRA_TEXT, "¡Este es el juego!\n\n" + boardGame.name + "\n\n" + boardGame.imageurl)
        startActivity(Intent.createChooser(shareIntent, "Compartir en"))

    }
}