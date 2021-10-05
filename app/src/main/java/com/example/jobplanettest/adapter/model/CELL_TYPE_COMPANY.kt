package com.example.jobplanettest.adapter.model

import com.example.jobplanettest.data.TestDataResponse
import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class CELL_TYPE_COMPANY(
    @SerializedName("ranking")
    val ranking: Int? = null,
    @SerializedName("cell_type")
    val cellType: String? = null,
    @SerializedName("interview_difficulty")
    val interviewDifficulty: Double? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("salary_avg")
    val salaryAvg: Long? = null,
    @SerializedName("web_site")
    val webSite: String? = null,
    @SerializedName("logo_path")
    val logoPath: String? = null,
    @SerializedName("interview_question")
    val interviewQuestion: String? = null,
    @SerializedName("company_id")
    val companyId: Long? = null,
    @SerializedName("has_job_posting")
    val hasJobPosting: Boolean? = null,
    @SerializedName("rate_total_avg")
    val rateTotalAvg: Double? = null,
    @SerializedName("industry_id")
    val industryId: Long? = null,
    @SerializedName("review_summary")
    val reviewSummary: String? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("simple_desc")
    val simpleDesc: String? = null,
    @SerializedName("industry_name")
    val industryName: String? = null,
    @SerializedName("count")
    val count: Int? = null,
    @SerializedName("themes")
    val themes: ArrayList<TestDataResponse.Theme> = arrayListOf(),
    @SerializedName("cons")
    val cons: String? = null,
    @SerializedName("days_ago")
    val daysAgo: Int? = null,
    @SerializedName("pros")
    val pros: String? = null,
    @SerializedName("occupation_name")
    val occupationName: String? = null,
    @SerializedName("data")
    val data: String? = null,
    @SerializedName("smb")
    val smb: ArrayList<Object> = arrayListOf()

) : Serializable

