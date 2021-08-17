package com.example.jobplanettest.util.retrofit

import com.example.jobplanettest.MOBILE_CONFIG_TEST_DATA
import com.example.jobplanettest.data.TestDataResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface TestData {
    @Headers("Accept: application/json")
    @GET(MOBILE_CONFIG_TEST_DATA)
    fun getTestData(): Call<TestDataResponse>
}