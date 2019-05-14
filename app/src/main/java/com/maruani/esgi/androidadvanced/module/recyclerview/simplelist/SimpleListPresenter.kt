package com.maruani.esgi.androidadvanced.module.recyclerview.simplelist

import com.maruani.esgi.androidadvanced.module.common.BasePresenter
import com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.api.FlickrProvider
import com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.model.FlickrPhoto

class SimpleListPresenter : BasePresenter<SimpleListView>() {

    override fun onCreate() {
        FlickrProvider.getPhotos(object : FlickrProvider.Listener<List<FlickrPhoto>> {
            override fun onSuccess(data: List<FlickrPhoto>) {
                view.updateData(data)
            }

            override fun onError(t: Throwable) {

            }
        })
    }
}