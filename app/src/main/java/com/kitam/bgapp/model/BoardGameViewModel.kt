package com.kitam.bgapp.model

import android.content.Intent
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.firebase.ui.auth.AuthUI
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.kitam.bgapp.BGToolBeltApp
import com.kitam.bgapp.data.data.BoardGame
import com.kitam.bgapp.data.data.BoardGameDetail
import com.kitam.bgapp.data.data.User
import com.kitam.bgapp.data.data.UserBoardGameCrossRef
import com.kitam.bgapp.domain.*
import com.kitam.bgapp.tools.SingleLiveEvent
import com.kitam.bgapp.tools.isNull
import com.kitam.bgapp.ui.login.LoginActivity
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class BoardGameViewModel : ViewModel() {
    var getBoardGamesUseCase = GetBoardGamesUseCase()
    var getTopBoardGamesUseCase = GetTopBoardGamesUseCase()
    var getRandomBoardGameUseCase = GetRandomBoardGameUseCase()
    var getBoardGameByIdUseCase = GetBoardGameByIdUseCase()
    var getDatabaseBoardGamesUseCase = GetDatabaseBoardGamesUseCase()
    var getDatabaseFavGamesByUser = GetDatabaseFavGamesByUserCase()
    var insertFavGameUseCase = InsertFavGameUseCase()

    val hotGamesList = MutableLiveData<List<BoardGame>>()
    val topGamesList = MutableLiveData<List<BoardGame>>()
    val upcomingGamesList = MutableLiveData<List<BoardGame>>()
    val favGamesList = MutableLiveData<List<BoardGame>>()
    val boardGameModel = SingleLiveEvent<BoardGameDetail>()
    val isLoading = MutableLiveData<Boolean>()
    val firstSetup = MutableLiveData<Boolean>()
    val needsSessionRefresh = MutableLiveData<Boolean>()
    val currentUser = MutableLiveData<User>()
    val selectedBoardGame = MutableLiveData<BoardGame>()
    val toastText = MutableLiveData<String>()


    private val coroutineExceptionHandler = CoroutineExceptionHandler{_ , throwable ->
        isLoading.postValue(false)
        toastText.postValue("Ocurrió un error inesperado")
        if(!throwable.message.isNull())
            FirebaseCrashlytics.getInstance().log(throwable.message!!)
    }

    fun onCreate() {

        viewModelScope.launch {

            try {

                isLoading.postValue(true)

                val email = FirebaseAuth.getInstance().currentUser?.email!!


                val user = withContext(Dispatchers.IO) {
                    BGToolBeltApp.database.taskDao().getUserByEmail(email)
                }

                if(user == null){
                    needsSessionRefresh.postValue(true)
                }
                currentUser.postValue(user)
                updateFavoriteGamesByUser(user.email)


                if (user.hotList.isNullOrEmpty() || user.upcomingList.isNullOrEmpty()) {

                    viewModelScope.launch {

                        val result = getBoardGamesUseCase()

                        if (!result!!.hotness.isNullOrEmpty()) {

                            hotGamesList.postValue(result.hotness!!)


                            withContext(Dispatchers.IO) {
                                BGToolBeltApp.database.taskDao().updateHotList(email, result.hotness!!)
                            }

                        }

                        if (!result.comingsoon.isNullOrEmpty()) {

                            upcomingGamesList.postValue(result.comingsoon!!)


                            withContext(Dispatchers.IO) {
                                BGToolBeltApp.database.taskDao()
                                    .updateUpcomingList(email, result.comingsoon!!)
                            }

                        }
                    }
                }else{
                    hotGamesList.postValue(user.hotList!!)
                    upcomingGamesList.postValue(user.upcomingList!!)
                }

                if (user.topList.isNullOrEmpty()) {


                    val result = getTopBoardGamesUseCase()

                    if (!result.isNullOrEmpty()) {

                        topGamesList.postValue(result)


                        withContext(Dispatchers.IO) {
                            BGToolBeltApp.database.taskDao().updateTopList(email, result)
                        }

                    }




                } else {

                    topGamesList.postValue(user.topList!!)

                }


                isLoading.postValue(false)
            }catch (e:Exception){
                e.printStackTrace()
                isLoading.postValue(false)

            }

        }

    }

    fun updateHotUpcomingList(){
        isLoading.postValue(true)

        val email = FirebaseAuth.getInstance().currentUser?.email!!

        if (currentUser.value?.hotList.isNullOrEmpty() || currentUser.value?.upcomingList.isNullOrEmpty()) {

            viewModelScope.launch {

                val result = getBoardGamesUseCase()

                if (!result!!.hotness.isNullOrEmpty()) {

                    hotGamesList.postValue(result.hotness!!)


                    withContext(Dispatchers.IO) {
                        BGToolBeltApp.database.taskDao().updateHotList(email, result.hotness!!)
                    }

                }

                if (!result.comingsoon.isNullOrEmpty()) {

                    upcomingGamesList.postValue(result.comingsoon!!)


                    withContext(Dispatchers.IO) {
                        BGToolBeltApp.database.taskDao()
                            .updateUpcomingList(email, result.comingsoon!!)
                    }

                }
            }
        }else{
            hotGamesList.postValue(currentUser.value?.hotList!!)
            upcomingGamesList.postValue(currentUser.value?.upcomingList!!)
        }
        isLoading.postValue(false)

    }

    fun updateTopList(){
        isLoading.postValue(true)

        val email = FirebaseAuth.getInstance().currentUser?.email!!

        if (currentUser.value?.topList.isNullOrEmpty()) {

            viewModelScope.launch {

                val result = getTopBoardGamesUseCase()

                if (!result.isNullOrEmpty()) {

                    topGamesList.postValue(result)


                    withContext(Dispatchers.IO) {
                        BGToolBeltApp.database.taskDao().updateHotList(email, result)
                    }

                }
            }
        }else{
            topGamesList.postValue(currentUser.value?.topList!!)

        }

        isLoading.postValue(false)

    }



    fun updateHotListByItem(boardGame:BoardGame){

        var tempList = hotGamesList?.value?.toMutableList()


        tempList?.forEachIndexed { index, thing ->
            thing.takeIf { it.id == thing.id}?.let {
                tempList[index] = thing
            }
        }

        if(!tempList.isNullOrEmpty())
            hotGamesList.postValue(tempList!!)
        //hotGamesList.value?.find { it.id == thing.id }?.copy(thing)


    }


    fun boardGameDescription(id:String){
        viewModelScope.launch(Dispatchers.IO + coroutineExceptionHandler) {
            isLoading.postValue(true)
            val fullBoardGame = getBoardGameByIdUseCase(id)
            if (!fullBoardGame.isNull()) {
                boardGameModel.postValue(fullBoardGame!!)
            }
            isLoading.postValue(false)
        }

    }

    fun addFavorite(boardGame:BoardGame) {
        viewModelScope.launch {
            if (!boardGame.isNull()) {
                withContext(Dispatchers.IO) {
                    BGToolBeltApp.database.taskDao().insertGame(boardGame)
                    if (!currentUser.value.isNull()) {
                        BGToolBeltApp.database.taskDao().insertUserWithBoardGames(
                            UserBoardGameCrossRef(
                                currentUser.value!!.email,
                                boardGame.id
                            )
                        )

                        updateFavoriteGamesByUser(currentUser.value!!.email)

                    }
                }
            }
        }
    }

    fun removeFavorite(boardGame:BoardGame) {
        viewModelScope.launch {
            if(!boardGame.isNull()) {
                if (!currentUser.value.isNull()) {
                    withContext(Dispatchers.IO) {
                        BGToolBeltApp.database.taskDao().removeUserWithBoardGames(
                            UserBoardGameCrossRef(
                                currentUser.value!!.email,
                                boardGame.id
                            )
                        )

                        updateFavoriteGamesByUser(currentUser.value!!.email)

                    }
                }
            }
        }
    }

    fun updateFavoriteGamesByUser(email:String) {
        viewModelScope.launch {


            withContext(Dispatchers.IO) {
                try {
                    val result = getDatabaseFavGamesByUser(email)
                    if (!result.isNullOrEmpty()) {
                        if (!result[0].boardGames.isNullOrEmpty()) {
                            favGamesList.postValue(result[0].boardGames)
                        }
                    }
                } catch (e: Exception) {
                    favGamesList.postValue(emptyList())
                }
            }
        }
    }

}