package com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.model

data class FlickrPhotoDetail(
    val id: String,
    val url: String,
    val title: String,
    val username: String,
    val description: String,
    val tags: List<String>
)