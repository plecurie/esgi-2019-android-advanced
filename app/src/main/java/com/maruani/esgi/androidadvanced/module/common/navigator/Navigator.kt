package com.maruani.esgi.androidadvanced.module.common.navigator

import android.app.Activity

class Navigator(activity: Activity) : BaseNavigator(activity) {
    fun toHome() = goTo(Route.HOME)
    fun toSimpleList() = goTo(Route.SIMPLE_LIST)
}