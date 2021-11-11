package com.wallia.bgtoolbelt.ui.home
import android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.text.htmlEncode
import androidx.core.text.parseAsHtml
import androidx.core.text.toSpanned
import androidx.core.view.isVisible
import androidx.core.widget.NestedScrollView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.transition.ChangeBounds
import androidx.transition.TransitionManager
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.wallia.bgtoolbelt.MainActivity
import com.wallia.bgtoolbelt.R
import com.wallia.bgtoolbelt.data.data.BoardGameProperty
import com.wallia.bgtoolbelt.databinding.FragmentHomeBinding
import com.wallia.bgtoolbelt.model.BoardGameViewModel
import java.lang.Math.abs
import com.wallia.bgtoolbelt.tools.toSpanned

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private val boardGameViewModel: BoardGameViewModel by viewModels()
    private var _binding:FragmentHomeBinding? = null
    private val binding get() = _binding!!
    val SCROLL_THRESHOLD_X = 10f
    val SCROLL_THRESHOLD_Y = 10f
    var x = 0f
    var y = 0f
    var isDescriptionShowing = false
    val constraintSet1 = ConstraintSet()
    val constraintSet2 = ConstraintSet()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {

        })

        boardGameViewModel.onCreate()


        boardGameViewModel.boardGameModel.observe(viewLifecycleOwner, Observer { currentBoardGame ->
            var authors = ""

            try {
                for (bgProperty: BoardGameProperty in currentBoardGame.propertyList!!) {
                    if (bgProperty.value.equals("boardgamedesigner", ignoreCase = true)) {
                        if (authors.isEmpty()) {
                            authors += bgProperty.value
                        } else {
                            authors += ", " + bgProperty.value
                        }
                    }
                }
                binding.tvAuthor.text = authors

            } catch (e: Exception) {

            }

            binding.tvHome.text = currentBoardGame.nameList?.get(0)?.value
            binding.tvDescription.text = currentBoardGame.description?.toSpanned()
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                binding.tvDescription.justificationMode = JUSTIFICATION_MODE_INTER_WORD
            }
            Glide.with(this)
                .load(currentBoardGame.image)
                .transition(DrawableTransitionOptions.withCrossFade())
                .fitCenter()
                .into(binding.ivImage)

        })

        boardGameViewModel.isLoading.observe(viewLifecycleOwner, Observer {
            (activity as MainActivity).progressBar?.isVisible = it
        })


        constraintSet1.clone(binding.viewContainer)
        constraintSet2.clone(context, R.layout.fragment_home_alt)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

      /*  binding.viewContainer.setOnClickListener{
            boardGameViewModel.randomQuote()

        }*/


        binding.scrollView.setOnTouchListener { v, event ->


            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    x = event.x
                    y = event.y
                }

                MotionEvent.ACTION_UP -> {
                    if (abs(x - event.x) < SCROLL_THRESHOLD_X || abs(y - event.y) < SCROLL_THRESHOLD_Y){

                        //tap
                        Log.d("HomeFragment", "Tap")
                        if(!isDescriptionShowing) {
                            startTransition()
                        }
                    }else{
                        //scroll horizontal

                            if(abs(x - event.x) > abs(y - event.y)){

                                if((x-event.x) > 0){
                                    boardGameViewModel.randomQuote()
                                   // Log.d("HomeFragment", "Swipe Right")

                                }else {
                                    boardGameViewModel.randomQuote()
                                   // Log.d("HomeFragment", "Swipe Left")

                                }

                            }else{
                                if((y - event.y) > 0){
                                   // Log.d("HomeFragment", "Swipe Up")
                                    //startTransition()

                                }else{
                                   // Log.d("HomeFragment", "Swipe Down")
                                    //startTransition()


                                }
                            }

                           /* if(abs(x - event.x) > SCROLL_THRESHOLD_X){

                                if((x-event.x) > 0){
                                    boardGameViewModel.randomQuote()
                                    Log.d("HomeFragment", "Swipe Right")

                                }else {
                                    boardGameViewModel.randomQuote()
                                    Log.d("HomeFragment", "Swipe Left")

                                }

                            }else if(abs(y - event.y) > SCROLL_THRESHOLD_Y){

                                if((y - event.y) > 0){
                                    Log.d("HomeFragment", "Swipe Up")
                                }else{
                                    Log.d("HomeFragment", "Swipe Down")

                                }

                            }*/

                    }
                }
            }
            v.performClick()
            v.onTouchEvent(event) ?: true
        }
    }


    fun startTransition(){

        if(isDescriptionShowing){
            binding.viewContainer.post {
                val transition = ChangeBounds()
                transition.duration = 250
                TransitionManager.beginDelayedTransition(binding.viewContainer, transition)
                constraintSet1.applyTo(binding.viewContainer)

            }

        }else{

            binding.viewContainer.post {
                val transition = ChangeBounds()
                transition.duration = 250
                TransitionManager.beginDelayedTransition(binding.viewContainer, transition)
                constraintSet2.applyTo(binding.viewContainer)

            }

        }

        toggleDescription()

      /*  ConstraintSet().apply {
            clone(binding.viewContainer);
            clone(context, R.layout.fragment_home_alt) // your transition
        }*/

    }

    fun toggleDescription(){
        isDescriptionShowing = !isDescriptionShowing
        if(isDescriptionShowing){
            binding.cvDescription.visibility = View.VISIBLE

        }else{
            binding.cvDescription.visibility = View.GONE

        }

    }




}