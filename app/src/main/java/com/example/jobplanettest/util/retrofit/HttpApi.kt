package com.example.jobplanettest.util.retrofit

import com.example.jobplanettest.TEST_DATA_BASE_URL
import com.example.jobplanettest.data.TestDataResponse
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class HttpApi {
    private val httpApiInterface: TestData
    private val baseUrl: String = TEST_DATA_BASE_URL

    companion object {
        val httpApi = HttpApi()
    }

    init {
        val retrofit = Retrofit.Builder()
            .client(OkHttpClient())
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        httpApiInterface = retrofit.create(TestData::class.java)
    }

    fun getTestData(): Call<TestDataResponse> {
        return httpApiInterface.getTestData()
    }
}

