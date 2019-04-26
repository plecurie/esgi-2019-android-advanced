package com.maruani.esgi.androidadvanced.module.recyclerview.simplelist

import com.maruani.esgi.androidadvanced.R
import com.maruani.esgi.androidadvanced.module.common.BaseActivity

class SimpleListActivity :
    BaseActivity<SimpleListPresenter, SimpleListView>(R.layout.activity_simple_list),
    SimpleListView {
}
