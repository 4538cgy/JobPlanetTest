package com.example.jobplanettest.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.jobplanettest.data.TestDataResponse
import com.example.jobplanettest.databinding.ItemCompanyBinding

class CompanyViewHolder(val binding: ItemCompanyBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: TestDataResponse.Item) {
        binding.apply {
            //itemcompany = item
        }
    }
}