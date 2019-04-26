package com.maruani.esgi.androidadvanced.module.common

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import com.maruani.esgi.androidadvanced.misc.utils.ClassUtils
import com.maruani.esgi.androidadvanced.module.common.navigator.Navigator

@Suppress("UNCHECKED_CAST")
abstract class BaseActivity<P : BasePresenter<V>, V : BaseView>(@LayoutRes val layout: Int) : AppCompatActivity(),
    BaseView {

    lateinit var presenter: P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = ClassUtils.instantiateTypeArgumentOf(javaClass)
        presenter.view = this as V
        presenter.navigator = Navigator(this)
        setContentView(layout)

        presenter.onCreate()
    }

    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

    override fun onPause() {
        super.onPause()
        presenter.onPause()
    }

    override fun onStop() {
        super.onStop()
        presenter.onStop()
    }
}