package com.kitam.bgapp.model

import android.content.Intent
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.firebase.ui.auth.AuthUI
import com.google.android.gms.maps.model.LatLng
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.google.firebase.messaging.FirebaseMessaging
import com.kitam.bgapp.BGToolBeltApp
import com.kitam.bgapp.R
import com.kitam.bgapp.data.data.*
import com.kitam.bgapp.domain.*
import com.kitam.bgapp.tools.SingleLiveEvent
import com.kitam.bgapp.tools.isNull
import com.kitam.bgapp.ui.login.LoginActivity
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.sql.Date
import java.sql.Timestamp
import java.util.concurrent.TimeUnit

class BoardGameViewModel : ViewModel() {
    var getBoardGamesUseCase = GetBoardGamesUseCase()
    var getTopBoardGamesUseCase = GetTopBoardGamesUseCase()
    var getCustomBoardGamesUseCase = GetCustomBoardGamesUseCase()
    var getRandomBoardGameUseCase = GetRandomBoardGameUseCase()
    var getBoardGameByIdUseCase = GetBoardGameByIdUseCase()
    var getDatabaseBoardGamesUseCase = GetDatabaseBoardGamesUseCase()
    var getDatabaseFavGamesByUser = GetDatabaseFavGamesByUserCase()
    var insertFavGameUseCase = InsertFavGameUseCase()
    var getProductsInStoresByName = GetProductsInStoresByName()


    val hotGamesList = MutableLiveData<List<BoardGame>>()
    val topGamesList = MutableLiveData<List<BoardGame>>()
    val customGameslist = MutableLiveData<List<BoardGame>>()

    val storesList = MutableLiveData<List<Store>>()
    val upcomingGamesList = MutableLiveData<List<BoardGame>>()
    val favGamesList = MutableLiveData<List<BoardGame>>()
    val boardGameModel = SingleLiveEvent<BoardGameDetail>()
    val isLoading = MutableLiveData<Boolean>()
    val firstSetup = MutableLiveData<Boolean>()
    val needsSessionRefresh = MutableLiveData<Boolean>()
    val currentUser = MutableLiveData<User>()
    val selectedBoardGame = MutableLiveData<BoardGame>()
    val toastText = MutableLiveData<String>()
    val loadingText = MutableLiveData<String>()
    val searchProductsInStoresResult = MutableLiveData<List<Product>>()
    val selectedStoreName = MutableLiveData<String>()



    private val coroutineExceptionHandler = CoroutineExceptionHandler{_ , throwable ->
        isLoading.postValue(false)
        toastText.postValue("Ocurrió un error inesperado")
        if(!throwable.message.isNull())
            FirebaseCrashlytics.getInstance().log(throwable.message!!)
    }



        fun onCreate() {
        loadingText.postValue("Comienza a buscar en las tiendas cercanas a ti.")
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
                updateStoresList();
                val currentTimestamp = System.currentTimeMillis()
                var timestampDelta : Long
                if(!user.lastUpdate.isNull()) {

                    timestampDelta =
                        TimeUnit.MILLISECONDS.toDays(currentTimestamp) - TimeUnit.MILLISECONDS.toDays(
                            user.lastUpdate!!
                        );
                }else{
                    timestampDelta = 0
                }


                if (user.hotList.isNullOrEmpty() || user.upcomingList.isNullOrEmpty() || user.lastUpdate.isNull() || timestampDelta >= 1) {

                    viewModelScope.launch {

                        val result = getBoardGamesUseCase()

                        if (!result!!.hotness.isNullOrEmpty()) {

                            hotGamesList.postValue(result.hotness!!)
                            val lastUpdateTimestamp = System.currentTimeMillis()

                            withContext(Dispatchers.IO) {
                                BGToolBeltApp.database.taskDao().updateLastUpdateTimestamp(email, lastUpdateTimestamp)
                            }



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

               // if (user.sponsoredList.isNullOrEmpty()) {
                    val result = getCustomBoardGamesUseCase()

                    if (!result.isNullOrEmpty()) {

                        customGameslist.postValue(result)


                        withContext(Dispatchers.IO) {
                            BGToolBeltApp.database.taskDao().updateCustomList(email, result)
                        }

                    }
               /* }else{
                    customGameslist.postValue(user.sponsoredList!!)

                }*/


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

    fun searchProductsInStoresResult(query:String, showLoader: Boolean){
        viewModelScope.launch(Dispatchers.IO + coroutineExceptionHandler) {
            if(showLoader)
                isLoading.postValue(true)
            val productList = getProductsInStoresByName(query)
            searchProductsInStoresResult.postValue(productList)
            if(showLoader)
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

                        FirebaseMessaging.getInstance().subscribeToTopic(boardGame.id)

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
                        FirebaseMessaging.getInstance().unsubscribeFromTopic(boardGame.id)
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
                        }else{
                            favGamesList.postValue(emptyList())
                        }
                    }
                } catch (e: Exception) {
                    favGamesList.postValue(emptyList())
                }
            }
        }
    }

    fun updateStoresList(){
        var stores: MutableList<Store> = mutableListOf()

        stores.add(Store(LatLng(19.34575, -99.17028), "Orcs Stories", "https://orcsstories.com/", R.drawable.logo_store_orcs_stories))
        stores.add(Store(LatLng(19.43861, -99.15650), "El Duende", "https://www.elduende.com.mx/", R.drawable.logo_store_el_duende))
        stores.add(Store(LatLng(19.35218, -99.18648), "JugandoAndo", "https://jugandoando.com/", R.drawable.logo_store_jugando_ando))
        stores.add(Store(LatLng(19.37137, -99.18014), "Gamesmart", "https://www.gamesmart.mx/", R.drawable.logo_store_games_smart))
        stores.add(Store(LatLng(19.41784, -99.16068), "Raven Folks", "https://ravenfolks.com/es/", R.drawable.logo_store_raven_folks))
        stores.add(Store(LatLng(19.37804, -99.17556), "La Caravana", "https://caravanagameshop.com/", R.drawable.logo_store_la_caravana))
        stores.add(Store(LatLng(19.50384, -99.04897), "Wontolla Games", "https://www.wontollagames.com/", R.drawable.logo_store_wontolla_games))
        stores.add(Store(LatLng(19.41784, -99.16068), "Dragon's Höhle", "https://www.dragonshohle.com.mx/", R.drawable.logo_store_dragons_hohle))
        stores.add(Store(LatLng(19.36677, -99.16257), "Santuario", "https://www.instagram.com/santuariojuegos/?r=nametag&fbclid=IwAR2hntr0SvHhmd9JEXXo4L1NYcQsS6LIYZsxG5o6MTH6zcKuAOPJFeXC5mA", R.drawable.logo_store_santuario))
        stores.add(Store(LatLng(19.41983, -99.12983), "Game Dojo", "https://www.facebook.com/gamedojo.mx/", R.drawable.logo_store_game_dojo))
        stores.add(Store(LatLng(19.39764, -99.10497), "El Club Juegos de Mesa", "https://elclubjuegosdemesa.negocio.site/", R.drawable.logo_store_club_juegos_de_mesa))
        stores.add(Store(LatLng(19.43066, -99.10547), "Roll Games", "https://rollgames.mx/web/", R.drawable.logo_store_roll_games))
        stores.add(Store(LatLng(19.35200, -99.21767), "Pirámide", "https://www.facebook.com/PiramideJuegos/", R.drawable.logo_store_piramide))
        stores.add(Store(LatLng(19.36571, -99.19785), "Kallisti", "https://www.kallisti.com.mx/", R.drawable.logo_store_kallisti))
        stores.add(Store(LatLng(19.49292, -99.13159), "Montecassino", "https://montecassino.com.mx/", R.drawable.logo_store_montecassino))
        stores.add(Store(LatLng(19.37773, -99.16756), "RedQueen Games", "https://www.redqueen.mx/", R.drawable.logo_store_red_queen))
        stores.add(Store(LatLng(19.40632, -99.16871), "PlayRoom", "https://www.playroomjugueteria.com.mx/", R.drawable.logo_store_playroom))
        stores.add(Store(LatLng(19.41754, -99.16340), "Pozos Ui Editorial", "", 0))

        storesList.postValue(stores)

    }


}