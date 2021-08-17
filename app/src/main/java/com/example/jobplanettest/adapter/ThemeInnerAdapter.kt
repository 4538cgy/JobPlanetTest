package com.example.jobplanettest.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.jobplanettest.R
import com.example.jobplanettest.adapter.viewholder.HorizontalThemeInnerViewHolder
import com.example.jobplanettest.data.TestDataResponse
import com.example.jobplanettest.databinding.ItemHorizontalThemeInnerItemBinding

class ThemeInnerAdapter(private val itemsList : ArrayList<TestDataResponse.Theme>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return HorizontalThemeInnerViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context),
            R.layout.item_horizontal_theme_inner_item,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as HorizontalThemeInnerViewHolder).bind(itemsList[position])
    }

    override fun getItemCount(): Int = itemsList.size

    override fun getItemViewType(position: Int): Int {
        return itemsList[position].id!!
    }


}