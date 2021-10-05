package com.example.jobplanettest.adapter.flexviewholder

import android.view.View
import com.example.jobplanettest.adapter.base.BaseViewHolder
import com.example.jobplanettest.adapter.model.CELL_TYPE_COMPANY
import com.example.jobplanettest.data.type.CELL_TYPE_COMPANY
import com.example.jobplanettest.databinding.ItemCompanyBinding

class CompanyFlexViewHolder(val binding : ItemCompanyBinding) : BaseViewHolder<CELL_TYPE_COMPANY>(binding.root)  {
    override fun onItemClick() {
        TODO("Not yet implemented")
    }

    override fun onBindView(item: CELL_TYPE_COMPANY?) {
        item?.let {
            val binding = ItemCompanyBinding.bind(itemView)
            binding.itemcompany = item
        }
    }

}