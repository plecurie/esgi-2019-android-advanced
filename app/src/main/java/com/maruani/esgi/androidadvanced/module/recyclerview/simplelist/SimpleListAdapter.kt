package com.maruani.esgi.androidadvanced.module.recyclerview.simplelist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.maruani.esgi.androidadvanced.R
import com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.model.FlickrPhoto

class SimpleListAdapter : RecyclerView.Adapter<SimpleListAdapter.SimpleListViewHolder>() {
    private var data: List<FlickrPhoto>? = null

    fun setData(data: List<FlickrPhoto>) {
        this.data = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_simple_photo, parent, false)
        return SimpleListViewHolder(view)
    }

    override fun getItemCount() = data?.size ?: 0

    override fun onBindViewHolder(holder: SimpleListViewHolder, position: Int) {
        val flickrPhoto = data!![position]
        holder.titleTv.text = flickrPhoto.title

        Glide.with(holder.itemView)
            .load(flickrPhoto.url)
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(holder.thumbnailImv)
    }


    class SimpleListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val thumbnailImv: ImageView = itemView.findViewById(R.id.item_photo_imv)
        val titleTv: TextView = itemView.findViewById(R.id.item_photo_title_tv)
    }

}