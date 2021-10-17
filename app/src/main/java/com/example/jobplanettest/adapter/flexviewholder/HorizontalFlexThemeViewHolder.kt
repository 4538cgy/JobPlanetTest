package com.example.jobplanettest.adapter.flexviewholder

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jobplanettest.adapter.base.BaseViewHolder
import com.example.jobplanettest.adapter.flex.FlexInnerAdapter
import com.example.jobplanettest.adapter.model.CELL_TYPE_COMPANY
import com.example.jobplanettest.databinding.ItemHorizontalThemeBinding

class HorizontalFlexThemeViewHolder(val binding : ItemHorizontalThemeBinding) : BaseViewHolder<CELL_TYPE_COMPANY>(binding.root) {
    override fun onBindView(item: CELL_TYPE_COMPANY?) {
        item?.let {
            setInnerAdapter(item)
        }
    }

    fun setInnerAdapter(item : CELL_TYPE_COMPANY){
        if (binding.itemHorizontalThemeRecyclerview.adapter == null) {
            binding.itemHorizontalThemeRecyclerview.adapter = FlexInnerAdapter(item.themes)
            binding.itemHorizontalThemeRecyclerview.layoutManager =
                LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)
        }
    }

    override fun onItemClick() {
        TODO("Not yet implemented")
    }
}