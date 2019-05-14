package com.maruani.esgi.androidadvanced.module.recyclerview.simplelist

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.maruani.esgi.androidadvanced.R
import com.maruani.esgi.androidadvanced.module.common.BaseActivity
import com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.model.FlickrPhoto

class SimpleListActivity :
    BaseActivity<SimpleListPresenter, SimpleListView>(R.layout.activity_simple_list),
    SimpleListView {

    private lateinit var photoRecyclerView: RecyclerView
    private var simpleListAdapter: SimpleListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        photoRecyclerView = findViewById(R.id.simplelist_photos_recyclerview)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        simpleListAdapter = SimpleListAdapter()
        photoRecyclerView.adapter = simpleListAdapter
        photoRecyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun updateData(data: List<FlickrPhoto>) {
        simpleListAdapter?.setData(data)
    }

}
