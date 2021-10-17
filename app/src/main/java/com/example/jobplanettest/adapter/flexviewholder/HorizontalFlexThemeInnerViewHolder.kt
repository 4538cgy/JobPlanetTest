package com.example.jobplanettest.adapter.flexviewholder

import com.example.jobplanettest.adapter.base.BaseViewHolder
import com.example.jobplanettest.adapter.model.CELL_TYPE_HORIZONTAL_THEME
import com.example.jobplanettest.data.TestDataResponse
import com.example.jobplanettest.databinding.ItemHorizontalThemeInnerItemBinding

class HorizontalFlexThemeInnerViewHolder(val binding : ItemHorizontalThemeInnerItemBinding) : BaseViewHolder<CELL_TYPE_HORIZONTAL_THEME>(binding.root) {

    override fun onItemClick() {
        TODO("Not yet implemented")
    }


    override fun onBindView(item: CELL_TYPE_HORIZONTAL_THEME?) {
        item?.let {
            binding.itemhorizontalthemeinneritem = item
        }
    }
}