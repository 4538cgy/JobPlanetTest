package com.example.jobplanettest.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.jobplanettest.R
import com.example.jobplanettest.base.BaseActivity
import com.example.jobplanettest.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.apply {
            activitymain = this@MainActivity


        }

        mainViewModel.getTestData()
        mainViewModel.testData.observe(this , Observer {
            it?.let{
                println("으아아 ${it.toString()}")
            }?.run{
                println("asdfasdf $it")
            }

        })
    }
}