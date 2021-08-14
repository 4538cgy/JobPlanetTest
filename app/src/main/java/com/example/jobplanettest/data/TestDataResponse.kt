package com.example.jobplanettest.data

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class TestDataResponse(
    @SerializedName("minimum_interviews")
    val minimumInterviews : Long ?= null,
    @SerializedName("total_page")
    val totalPage : Long ? = null,
    @SerializedName("minimum_reviews")
    val minimumReviews : Long ? = null,
    @SerializedName("total_count")
    val totalCount : Long ? = null,
    @SerializedName("items")
    val items : ArrayList<Item> = arrayListOf(),
    @SerializedName("page")
    val page : Int ? = null,
    @SerializedName("page_size")
    val pageSize : Int ? = null,
    @SerializedName("minimum_salaries")
    val minimumSalaries : Int ? = null


) : Serializable {
    data class Item(
        @SerializedName("ranking")
        val ranking : Int ? = null,
        @SerializedName("cell_type")
        val cellType : String ? = null,
        @SerializedName("interview_difficulty")
        val interviewDifficulty : Double ? = null,
        @SerializedName("name")
        val name : String ? = null,
        @SerializedName("salary_avg")
        val salaryAvg : Long ? = null,
        @SerializedName("web_site")
        val webSite : String ? = null,
        @SerializedName("logo_path")
        val logoPath : String ? = null,
        @SerializedName("interview_question")
        val interviewQuestion : String ? = null,
        @SerializedName("company_id")
        val companyId : Long ? = null,
        @SerializedName("has_job_posting")
        val hasJobPosting : Boolean ? = null,
        @SerializedName("rate_total_avg")
        val rateTotalAvg : Double ? = null,
        @SerializedName("industry_id")
        val industryId : Long ? = null,
        @SerializedName("review_summary")
        val reviewSummary : String ? = null,
        @SerializedName("type")
        val type : String ? = null,
        @SerializedName("simple_desc")
        val simpleDesc : String ? = null,
        @SerializedName("industry_name")
        val industryName : String ? = null,
        @SerializedName("count")
        val count : Int ? = null,
        @SerializedName("themes")
        val themes : ArrayList<Theme> = arrayListOf(),
        @SerializedName("cons")
        val cons : String ? = null,
        @SerializedName("days_ago")
        val daysAgo : Int ? = null,
        @SerializedName("pros")
        val pros : String ? = null,
        @SerializedName("occupation_name")
        val occupationName : String ? = null,
        @SerializedName("data")
        val data : String ? = null,
        @SerializedName("smb")
        val smb : ArrayList<Object> = arrayListOf()

    ): Serializable

    data class Theme(
        @SerializedName("color")
        val color : String ? = null,
        @SerializedName("cover_image")
        val coverImage : String ? = null,
        @SerializedName("id")
        val id : Int ? = null,
        @SerializedName("title")
        val title : String ? = null

    ): Serializable
}