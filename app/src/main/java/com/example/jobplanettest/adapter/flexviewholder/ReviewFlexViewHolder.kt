package com.example.jobplanettest.adapter.flexviewholder

import android.view.View
import com.example.jobplanettest.adapter.base.BaseViewHolder
import com.example.jobplanettest.adapter.model.CELL_TYPE_COMPANY
import com.example.jobplanettest.adapter.model.CELL_TYPE_REVIEW
import com.example.jobplanettest.databinding.ItemReviewBinding

class ReviewFlexViewHolder(val binding : ItemReviewBinding) : BaseViewHolder<CELL_TYPE_COMPANY>(binding.root) {
    override fun onItemClick() {
        TODO("Not yet implemented")
    }

    override fun onBindView(item: CELL_TYPE_COMPANY?) {
        item?.let {
            binding.itemreview = item
        }
    }
}