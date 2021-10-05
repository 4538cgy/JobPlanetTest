package com.example.jobplanettest.adapter.base

import androidx.recyclerview.widget.RecyclerView

abstract class BaseListAdapter : RecyclerView.Adapter<BaseViewHolder<*>?>() {
    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        if (position >= itemCount - 1) {
            moreLoad()
        }
    }

    abstract fun moreLoad()
}