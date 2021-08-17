package com.example.jobplanettest.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.jobplanettest.data.TestDataResponse
import com.example.jobplanettest.databinding.ItemHorizontalThemeInnerItemBinding

class HorizontalThemeInnerViewHolder(private val binding : ItemHorizontalThemeInnerItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item : TestDataResponse.Theme){
        binding.apply {
            itemhorizontalthemeinneritem = item
        }
    }
}