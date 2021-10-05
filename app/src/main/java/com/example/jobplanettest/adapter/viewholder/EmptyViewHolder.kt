package com.example.jobplanettest.adapter.viewholder

import android.content.Context
import android.widget.LinearLayout
import com.example.jobplanettest.adapter.base.BaseViewHolder

/**
 * ItemType 에서 ViewHolder 생성 Exception 발생시 빈 ViewHolder을 리턴하도록함
 **/
class EmptyViewHolder(context: Context) : BaseViewHolder<Any>(LinearLayout(context)) {

    override fun onItemClick() {}
    override fun onBindView(item: Any) {}
}