package com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.api

import com.maruani.esgi.androidadvanced.BuildConfig
import com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.dto.EPhotosResponse
import com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.dto.mapper.EPhotosResponseMapper
import com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.model.FlickrPhoto
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object FlickrProvider {
    private val USER_ID = "94993041@N05"
    private var service: FlickrService

    init {
        service = Retrofit.Builder().baseUrl(BuildConfig.FLICKR_API_URL)
            .client(createOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FlickrService::class.java)
    }

    private fun createOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor {
                val request = it.request()
                val url = request.url()

                val urlBuilder = url.newBuilder()
                    .addQueryParameter("api_key", BuildConfig.FLICKR_API_KEY)
                    .addQueryParameter("format", BuildConfig.FLICKR_API_FORMAT)
                    .addQueryParameter("nojsoncallback", BuildConfig.FLICKR_API_CALLBACK)

                val newUrl = urlBuilder.build()
                val newRequest = request.newBuilder().url(newUrl).build()
                it.proceed(newRequest)
            }
            .build()
    }

    fun getPhotos(listener: Listener<List<FlickrPhoto>>) {
        service.getPublicPhotos(USER_ID).enqueue(object : Callback<EPhotosResponse> {
            override fun onFailure(call: Call<EPhotosResponse>, t: Throwable) {
                listener.onError(t)
            }

            override fun onResponse(call: Call<EPhotosResponse>, response: Response<EPhotosResponse>) {
                response.body()?.also {
                    val photos = EPhotosResponseMapper().map(it)
                    listener.onSuccess(photos)
                }
            }

        })
    }

    interface Listener<T> {
        fun onSuccess(data: T)
        fun onError(t: Throwable)
    }

}