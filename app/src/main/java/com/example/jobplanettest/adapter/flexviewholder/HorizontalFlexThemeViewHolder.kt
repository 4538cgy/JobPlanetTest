package com.example.jobplanettest.adapter.flexviewholder

import android.view.View
import com.example.jobplanettest.adapter.ThemeInnerAdapter
import com.example.jobplanettest.adapter.base.BaseViewHolder
import com.example.jobplanettest.adapter.flex.FlexInnerAdapter
import com.example.jobplanettest.adapter.model.CELL_TYPE_HORIZONTAL_THEME
import com.example.jobplanettest.databinding.ItemHorizontalThemeBinding

class HorizontalFlexThemeViewHolder(val binding : ItemHorizontalThemeBinding) : BaseViewHolder<CELL_TYPE_HORIZONTAL_THEME>(binding.root) {
    override fun onBindView(item: CELL_TYPE_HORIZONTAL_THEME?) {
        item?.let {

        }
    }

    fun setInnerAdapter(themeList : ArrayList<CELL_TYPE_HORIZONTAL_THEME>){
        binding.itemHorizontalThemeRecyclerview.adapter = FlexInnerAdapter(themeList)
    }

    override fun onItemClick() {
        TODO("Not yet implemented")
    }
}