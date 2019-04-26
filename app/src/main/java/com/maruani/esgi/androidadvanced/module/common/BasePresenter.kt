package com.maruani.esgi.androidadvanced.module.common

import com.maruani.esgi.androidadvanced.module.common.navigator.Navigator

abstract class BasePresenter<V : BaseView> {
    lateinit var view: V
    lateinit var navigator: Navigator

    open fun onCreate() {

    }

    open fun onResume() {

    }

    open fun onPause() {

    }

    open fun onStop() {

    }
}