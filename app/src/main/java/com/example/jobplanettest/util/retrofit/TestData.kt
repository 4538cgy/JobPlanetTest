package com.example.jobplanettest.util.retrofit

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface TestData {

    @Headers("Accept: application/json")
    @GET("/test_data.json")
    fun getTestData() : Call<>
}