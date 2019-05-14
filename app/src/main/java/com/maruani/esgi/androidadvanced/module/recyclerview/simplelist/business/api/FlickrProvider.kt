package com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.api

import com.maruani.esgi.androidadvanced.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object FlickrProvider {
    private var service: FlickrService

    init {
        service = Retrofit.Builder().baseUrl(BuildConfig.FLICKR_API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FlickrService::class.java)
    }
}