package com.maruani.esgi.androidadvanced.module.recyclerview.simplelist.business.dto

import com.google.gson.annotations.SerializedName

data class EPhotoDetail(
    @SerializedName("photo")
    val photo: Photo
) {
    data class Photo(
        @SerializedName("dates")
        val dates: EDates,
        @SerializedName("dateuploaded")
        val dateuploaded: String,
        @SerializedName("description")
        val description: EDescription,
        @SerializedName("farm")
        val farm: String,
        @SerializedName("id")
        val id: String,
        @SerializedName("isfavorite")
        val isfavorite: Int,
        @SerializedName("license")
        val license: Int,
        @SerializedName("media")
        val media: String,
        @SerializedName("owner")
        val owner: EOwner,
        @SerializedName("secret")
        val secret: String,
        @SerializedName("server")
        val server: String,
        @SerializedName("tags")
        val tags: ETags,
        @SerializedName("title")
        val title: ETitle,
        @SerializedName("views")
        val views: String
    ) {
        data class EDates(
            @SerializedName("lastupdate")
            val lastupdate: String,
            @SerializedName("posted")
            val posted: String,
            @SerializedName("taken")
            val taken: String,
            @SerializedName("takengranularity")
            val takengranularity: Int,
            @SerializedName("takenunknown")
            val takenunknown: Int
        )

        data class ETags(
            @SerializedName("tag")
            val tag: List<ETag>
        ) {
            data class ETag(
                @SerializedName("_content")
                val content: String,
                @SerializedName("author")
                val author: String,
                @SerializedName("authorname")
                val authorname: String,
                @SerializedName("id")
                val id: String,
                @SerializedName("machine_tag")
                val machineTag: Int,
                @SerializedName("raw")
                val raw: String
            )
        }

        data class EDescription(
            @SerializedName("_content")
            val content: String
        )

        data class EOwner(
            @SerializedName("realname")
            val realname: String,
            @SerializedName("username")
            val username: String
        )

        data class ETitle(
            @SerializedName("_content")
            val content: String
        )

    }
}

