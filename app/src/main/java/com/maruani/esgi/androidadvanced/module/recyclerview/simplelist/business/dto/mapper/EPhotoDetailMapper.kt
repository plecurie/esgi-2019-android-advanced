package com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.dto.mapper

import com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.dto.EPhotoDetail
import com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.model.FlickrPhotoDetail
import com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.util.FlickrUtil

class EPhotoDetailMapper {
    fun map(ePhotoDetail: EPhotoDetail): FlickrPhotoDetail {
        return ePhotoDetail.photo.run {
            val url = FlickrUtil.getPhotoPublicUrl(id, secret, server, farm)
            val tags = tags.tag.map { it.raw }

            FlickrPhotoDetail(id, url, title.content, owner.username, description.content, tags)
        }
    }
}