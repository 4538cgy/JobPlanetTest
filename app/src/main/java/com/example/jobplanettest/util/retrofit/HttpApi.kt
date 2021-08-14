package com.example.jobplanettest.util.retrofit

import com.example.jobplanettest.R
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HttpApi {
    private val HttpApiInterface : TestData
    private val baseUrl : String = R.string.test_data_base_url.toString()

    init {
        val retrofit = Retrofit.Builder()
            .client(OkHttpClient())
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        HttpApiInterface = retrofit.create(TestData::class.java)
    }
}