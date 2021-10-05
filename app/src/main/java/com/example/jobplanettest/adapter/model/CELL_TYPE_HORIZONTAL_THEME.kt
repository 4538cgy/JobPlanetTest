package com.example.jobplanettest.adapter.model

import com.example.jobplanettest.data.TestDataResponse
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CELL_TYPE_HORIZONTAL_THEME(

    @SerializedName("color")
    val color: String? = null,
    @SerializedName("cover_image")
    val coverImage: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("title")
    val title: String? = null

) : Serializable