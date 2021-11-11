package com.wallia.bgtoolbelt.core

import com.tickaroo.tikxml.TikXml
import com.tickaroo.tikxml.converter.htmlescape.HtmlEscapeStringConverter
import com.tickaroo.tikxml.retrofit.TikXmlConverterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

object RetrofitHelper {

    fun getRetrofit(): Retrofit {

        val okHttpClient = OkHttpClient().newBuilder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .build()
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("https://www.boardgamegeek.com/xmlapi2/")
            .addConverterFactory(
                TikXmlConverterFactory.create(
                    TikXml.Builder()
                        .exceptionOnUnreadXml(false)
                        .addTypeConverter(String.javaClass, HtmlEscapeStringConverter())
                        .build()
                )
            )
            .build()

    }

}