package com.example.jobplanettest.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.jobplanettest.R
import com.example.jobplanettest.adapter.viewholder.CompanyViewHolder
import com.example.jobplanettest.adapter.viewholder.HorizontalThemeViewHolder
import com.example.jobplanettest.adapter.viewholder.ReviewViewHolder
import com.example.jobplanettest.data.TestDataResponse
import com.example.jobplanettest.data.type.CELL_TYPE_COMPANY
import com.example.jobplanettest.data.type.CELL_TYPE_HORIZONTAL_THEME
import com.example.jobplanettest.data.type.CELL_TYPE_REVIEW

class MultiViewAdapter(private var items : List<TestDataResponse.Item>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
            CELL_TYPE_COMPANY -> CompanyViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context),R.layout.item_company,parent,false))
            CELL_TYPE_REVIEW -> ReviewViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context),R.layout.item_review,parent,false))
            else -> HorizontalThemeViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context),R.layout.item_horizontal_theme,parent,false))
        }
    }

    override fun getItemId(position: Int) = position.toLong()

    override fun getItemViewType(position: Int): Int {
        return when(items[position].cellType){
            "CELL_TYPE_COMPANY" -> CELL_TYPE_COMPANY
            "CELL_TYPE_REVIEW" -> CELL_TYPE_REVIEW
            else -> CELL_TYPE_HORIZONTAL_THEME
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(items[position].cellType){
            "CELL_TYPE_COMPANY" -> (holder as CompanyViewHolder).bind(items[position])
            "CELL_TYPE_REVIEW" -> (holder as ReviewViewHolder).bind(items[position])
            "CELL_TYPE_HORIZONTAL_THEME" -> {
                (holder as HorizontalThemeViewHolder)
                holder.bind(items[position].themes,holder.binding.root.context)
            }
        }
    }

    fun updateData(data : ArrayList<TestDataResponse.Item>){
        items = data
        notifyDataSetChanged()
    }

    override fun getItemCount() = items.size


}