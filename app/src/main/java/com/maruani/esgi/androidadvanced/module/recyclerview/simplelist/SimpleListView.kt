package com.maruani.esgi.androidadvanced.module.recyclerview.simplelist

import com.maruani.esgi.androidadvanced.module.common.BaseView
import com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.model.FlickrPhoto

interface SimpleListView : BaseView {
    fun updateData(data: List<FlickrPhoto>)
}