package com.example.jobplanettest.adapter.model

import com.example.jobplanettest.data.TestDataResponse
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CELL_TYPE_REVIEW(

    @SerializedName("minimum_interviews")
    val minimumInterviews: Long? = null,
    @SerializedName("total_page")
    val totalPage: Long? = null,
    @SerializedName("minimum_reviews")
    val minimumReviews: Long? = null,
    @SerializedName("total_count")
    val totalCount: Long? = null,
    @SerializedName("items")
    val items: ArrayList<TestDataResponse.Item> = arrayListOf(),
    @SerializedName("page")
    val page: Int? = null,
    @SerializedName("page_size")
    val pageSize: Int? = null,
    @SerializedName("minimum_salaries")
    val minimumSalaries: Int? = null


) : Serializable