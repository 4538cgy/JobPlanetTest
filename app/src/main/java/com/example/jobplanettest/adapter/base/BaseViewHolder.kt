package com.example.jobplanettest.adapter.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.jobplanettest.adapter.flex.FlexListAdapter


abstract class BaseViewHolder<ITEM>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var adapter: FlexListAdapter? = null

    abstract fun onBindView(item: ITEM?)
    abstract fun onItemClick()
    protected fun disableClickEvent() {
        //ViewPressEffectHelper.detach(itemView)
        itemView.setOnClickListener(null)
    }

    companion object {
        private const val showPressEffect = true
    }

    init {
        if (showPressEffect) {
            //ViewPressEffectHelper.attach(itemView)
            itemView.setOnClickListener { v: View? -> onItemClick() }
        }
    }
}