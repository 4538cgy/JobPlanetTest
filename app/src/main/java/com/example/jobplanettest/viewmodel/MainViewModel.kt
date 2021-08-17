package com.example.jobplanettest.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jobplanettest.data.TestDataResponse
import com.example.jobplanettest.repository.TestDataRepository.Companion.testDataRepository
import com.example.jobplanettest.util.retrofit.TestData
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val testData = MutableLiveData<TestDataResponse>()

    fun getTestData() {
        viewModelScope.launch {
            testDataRepository.getTestData().collect {
                testData.postValue(it)
            }
        }
    }
}