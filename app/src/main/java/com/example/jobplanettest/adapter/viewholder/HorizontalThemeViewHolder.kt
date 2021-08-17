package com.example.jobplanettest.adapter.viewholder

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jobplanettest.adapter.ThemeInnerAdapter
import com.example.jobplanettest.data.TestDataResponse
import com.example.jobplanettest.databinding.ItemHorizontalThemeBinding

class HorizontalThemeViewHolder(val binding: ItemHorizontalThemeBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(themeList: ArrayList<TestDataResponse.Theme>, context: Context) {
        binding.itemHorizontalThemeRecyclerview.adapter = ThemeInnerAdapter(themeList)
        binding.itemHorizontalThemeRecyclerview.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}