package com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.util

import com.maruani.esgi.androidadvanced.BuildConfig

class FlickrUtil {

    companion object {

        private val FARM_ID = "{farm-id}"
        private val SERVER_ID = "{server-id}"
        private val PHOTO_ID = "{photo-id}"
        private val PHOTO_SECRET = "{photo-secret}"

        fun getPhotoPublicUrl(id: String, secret: String, server: String, farm: String): String {
            return BuildConfig.FLICKR_PHOTO_URL_FORMAT
                .replace(FARM_ID, farm)
                .replace(SERVER_ID, server)
                .replace(PHOTO_ID, id)
                .replace(PHOTO_SECRET, secret)
        }

    }

}