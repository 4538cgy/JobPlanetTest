package com.example.jobplanettest.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jobplanettest.R
import com.example.jobplanettest.adapter.MultiViewAdapter
import com.example.jobplanettest.base.BaseActivity
import com.example.jobplanettest.data.TestDataResponse
import com.example.jobplanettest.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.apply {
            activitymain = this@MainActivity

            activityMainRecyclerview.apply {
                adapter = MultiViewAdapter(emptyList())
                layoutManager =
                    LinearLayoutManager(binding.root.context, LinearLayoutManager.VERTICAL, false)
            }
        }
        mainViewModel.getTestData()
        mainViewModel.testData.observe(this, Observer {
            it?.let {
                (binding.activityMainRecyclerview.adapter as MultiViewAdapter).updateData(it.items)
            }?.run {
            }

        })
    }
}