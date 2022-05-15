package com.kitam.bgapp.domain;

import com.kitam.bgapp.data.APIRepository
import com.kitam.bgapp.data.data.BoardGame
import com.kitam.bgapp.data.data.BoardGameDetail
import com.kitam.bgapp.data.data.Product

class GetProductsInStoresByName {

    private val repository = APIRepository()

    suspend operator fun invoke(query:String):List<Product> = repository.getProductsInStoreByName(query)
}


