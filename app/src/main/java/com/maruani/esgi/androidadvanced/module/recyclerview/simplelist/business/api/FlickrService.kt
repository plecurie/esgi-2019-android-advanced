package com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.api

import com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.dto.EPhotoDetail
import com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.dto.EPhotosResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface FlickrService {
    @GET("?method=flickr.people.getPublicPhotos")
    fun getPublicPhotos(@Query("user_id") userId: String): Call<EPhotosResponse>

    @GET("?method=flickr.photos.getInfo")
    fun getPhotoInfo(@Query("photo_id") photoId: String): Call<EPhotoDetail>

}