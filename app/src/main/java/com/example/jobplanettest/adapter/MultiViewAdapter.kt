package com.example.jobplanettest.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestListener
import com.example.jobplanettest.R
import com.example.jobplanettest.adapter.viewholder.CompanyViewHolder
import com.example.jobplanettest.adapter.viewholder.HorizontalThemeViewHolder
import com.example.jobplanettest.adapter.viewholder.ReviewViewHolder
import com.example.jobplanettest.data.TestDataResponse
import com.example.jobplanettest.data.type.CELL_TYPE_COMPANY
import com.example.jobplanettest.data.type.CELL_TYPE_HORIZONTAL_THEME
import com.example.jobplanettest.data.type.CELL_TYPE_REVIEW

class MultiViewAdapter(private var items: List<TestDataResponse.Item>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            CELL_TYPE_COMPANY -> CompanyViewHolder(
                DataBindingUtil.inflate(
                    LayoutInflater.from(
                        parent.context
                    ), R.layout.item_company, parent, false
                )
            )
            CELL_TYPE_REVIEW -> ReviewViewHolder(
                DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.item_review,
                    parent,
                    false
                )
            )
            else -> HorizontalThemeViewHolder(
                DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.item_horizontal_theme,
                    parent,
                    false
                )
            )
        }
    }

    override fun getItemId(position: Int) = position.toLong()

    override fun getItemViewType(position: Int): Int {
        return when (items[position].cellType) {
            "CELL_TYPE_COMPANY" -> CELL_TYPE_COMPANY
            "CELL_TYPE_REVIEW" -> CELL_TYPE_REVIEW
            else -> CELL_TYPE_HORIZONTAL_THEME
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (items[position].cellType) {
            "CELL_TYPE_COMPANY" -> {
                (holder as CompanyViewHolder).bind(items[position])
                imageLoad(
                    holder.binding.itemCompanyImageviewLogo, holder.binding.root.context,
                    items[position].logoPath!!
                )

            }
            "CELL_TYPE_REVIEW" -> {
                (holder as ReviewViewHolder).bind(items[position])
                imageLoad(
                    holder.binding.itemReviewImageviewLogoPath, holder.binding.root.context,
                    items[position].logoPath!!
                )
            }
            "CELL_TYPE_HORIZONTAL_THEME" -> {
                (holder as HorizontalThemeViewHolder)
                holder.bind(items[position].themes, holder.binding.root.context)
            }
        }
    }

    private fun imageLoad(imageView: ImageView, context: Context, imageUrl: String) {
        Glide.with(context).load(imageUrl).error(R.drawable.ic_warning).thumbnail(0.1f)
            .into(imageView)
    }

    fun updateData(data: ArrayList<TestDataResponse.Item>) {
        items = data
        notifyDataSetChanged()
    }

    override fun getItemCount() = items.size


}