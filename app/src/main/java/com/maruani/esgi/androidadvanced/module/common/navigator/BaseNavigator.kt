package com.maruani.esgi.androidadvanced.module.common.navigator

import android.app.Activity
import android.content.Intent

abstract class BaseNavigator(private val activity: Activity) {
    fun goTo(route: Route) {
        val intent = Intent(activity, route.activityClass)
        activity.startActivity(intent)
    }
}