package com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.dto.mapper

import com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.dto.EPhotosResponse
import com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.model.FlickrPhoto
import com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.util.FlickrUtil

class EPhotosResponseMapper {

    fun map(photosResponse: EPhotosResponse): List<FlickrPhoto> {
        val ePhotoList = photosResponse.photos.photoList

        return ePhotoList.map { ePhoto ->
            val url = FlickrUtil.getPhotoPublicUrl(ePhoto.id, ePhoto.secret, ePhoto.server, ePhoto.farm)
            FlickrPhoto(ePhoto.id, url, ePhoto.title)
        }
    }

}