package com.example.jobplanettest.adapter.flex

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.jobplanettest.R
import com.example.jobplanettest.adapter.flexviewholder.HorizontalFlexThemeInnerViewHolder
import com.example.jobplanettest.adapter.model.CELL_TYPE_HORIZONTAL_THEME
import com.example.jobplanettest.adapter.viewholder.HorizontalThemeInnerViewHolder
import com.example.jobplanettest.data.TestDataResponse

class FlexInnerAdapter(private val itemsList: ArrayList<CELL_TYPE_HORIZONTAL_THEME>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return HorizontalThemeInnerViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_horizontal_theme_inner_item, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as HorizontalFlexThemeInnerViewHolder).onBindView(itemsList[position])

        Glide.with(holder.binding.root.context).load(itemsList[position].coverImage)
            .error(R.drawable.ic_warning).thumbnail(0.1f)
            .into(holder.binding.itemHorizontalThemeInnerItemImageviewCoverImage)
    }

    override fun getItemCount(): Int = itemsList.size

    override fun getItemViewType(position: Int): Int {
        return itemsList[position].id!!
    }


}