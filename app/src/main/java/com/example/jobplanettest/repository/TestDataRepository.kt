package com.example.jobplanettest.repository

import com.example.jobplanettest.data.TestDataResponse
import com.example.jobplanettest.util.retrofit.HttpApi
import com.example.jobplanettest.util.retrofit.HttpApi.Companion.httpApi
import com.example.jobplanettest.util.retrofit.TestData
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.channels.trySendBlocking
import kotlinx.coroutines.flow.callbackFlow
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TestDataRepository {

    companion object{
        val testDataRepository = TestDataRepository()
    }

    @ExperimentalCoroutinesApi
    fun getTestData() = callbackFlow<TestDataResponse?> {
        val eventListener = httpApi.getTestData().enqueue(object : Callback<TestDataResponse>{
            override fun onResponse(call: Call<TestDataResponse>, response: Response<TestDataResponse>) {


                response.body()?.let {
                    //받아온 데이터 전달
                    this@callbackFlow.trySendBlocking(response.body()!!)
                }
            }

            override fun onFailure(call: Call<TestDataResponse>, t: Throwable) {
               this@callbackFlow.trySendBlocking(null)
            }

        })

        awaitClose { eventListener }
    }
}