package com.kitam.bgapp.model

import com.kitam.bgapp.data.data.BoardGame

class BoardGameProvider {
    companion object {
        var hotGames:List<BoardGame> = emptyList()
        var upcomingGames:List<BoardGame> = emptyList()

    }

}