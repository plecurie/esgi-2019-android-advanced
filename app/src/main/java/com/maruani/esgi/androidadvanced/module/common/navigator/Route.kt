package com.maruani.esgi.androidadvanced.module.common.navigator

import android.app.Activity
import com.maruani.esgi.androidadvanced.module.customview.CustomViewActivity
import com.maruani.esgi.androidadvanced.module.home.HomeActivity
import com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.SimpleListActivity

enum class Route constructor(val activityClass: Class<out Activity>) {
    HOME(HomeActivity::class.java),
    SIMPLE_LIST(SimpleListActivity::class.java),
    CUSTOM_VIEW(CustomViewActivity::class.java)
}