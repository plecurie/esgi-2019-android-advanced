package com.maruani.esgi.androidadvanced.module.home

import android.os.Bundle
import android.widget.Button
import com.maruani.esgi.androidadvanced.R
import com.maruani.esgi.androidadvanced.module.common.BaseActivity

class HomeActivity : BaseActivity<HomePresenter, HomeView>(R.layout.activity_home), HomeView {

    lateinit var recyclerViewButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        recyclerViewButton = findViewById(R.id.home_recyclerview_button)
        recyclerViewButton.setOnClickListener {
            presenter.onRecyclerButtonClick()
        }

        findViewById<Button>(R.id.home_customview_button).setOnClickListener {
            presenter.onCustomViewButtonClick()
        }

    }
}