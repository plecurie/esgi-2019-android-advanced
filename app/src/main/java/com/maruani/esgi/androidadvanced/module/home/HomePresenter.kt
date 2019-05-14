package com.maruani.esgi.androidadvanced.module.home

import com.maruani.esgi.androidadvanced.module.common.BasePresenter

class HomePresenter : BasePresenter<HomeView>() {
    fun onRecyclerButtonClick() {
        navigator.toSimpleList()
    }

    fun onCustomViewButtonClick() {
        navigator.toCustomView()
    }
}