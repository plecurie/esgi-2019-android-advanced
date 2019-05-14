package com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.dto

import com.google.gson.annotations.SerializedName

data class EPhotosResponse(@SerializedName("photos") val photos: EPhotos)

data class EPhotos(@SerializedName("photo") val photoList: List<EPhoto>)

data class EPhoto(
    @SerializedName("id") val id: String,
    @SerializedName("secret") val secret: String,
    @SerializedName("server") val server: String,
    @SerializedName("farm") val farm: String,
    @SerializedName("title") val title: String
)