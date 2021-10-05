package com.example.jobplanettest.adapter.flex

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.jobplanettest.adapter.base.BaseListAdapter
import com.example.jobplanettest.adapter.base.BaseViewHolder
import com.example.jobplanettest.base.BaseItemModel
import com.example.jobplanettest.data.type.ItemType

open class FlexListAdapter : BaseListAdapter() {

    var items = ArrayList<BaseItemModel>()

    @Suppress("UNCHECKED_CAST")
    fun <ITEM : Any> getItem(position : Int) : ITEM? = items[position] as? ITEM

    interface OnAdapterEventListener{
        fun requestMore()
        fun requestListTop()
    }

    private var onAdapterEventListener : OnAdapterEventListener ? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Any> {
        val type = ItemType.Type.values()[viewType]

        val baseViewHolder = if (type.getBindingName() != null) {
            type.newViewHolderInstanceDataBindingVer(parent)
        } else {
            val itemView = LayoutInflater.from(parent.context).inflate(type.getXmlId()!!, parent, false)
            type.newViewHolderInstance(itemView)
        }

        // Check Footer
        /*
        if (baseViewHolder is VHFooterItem) {
            baseViewHolder.setOnClickFooterEvent(onClickFooterEvent)
        }

         */

        return baseViewHolder as BaseViewHolder<Any>
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        super.onBindViewHolder(holder, position)
        holder.onBindView(getItem(position))
    }

    override fun getItemViewType(position: Int): Int {
        return if (items.isEmpty()) -1 else items[position].getType()?.ordinal!!
    }

    override fun moreLoad() {
        onAdapterEventListener?.requestMore()
    }

    override fun getItemCount(): Int {
        return items.size
    }

    /*
    private val onClickFooterEvent = {
        if (onAdapterEventListener != null)
            onAdapterEventListener?.requestListTop()
    }

     */

    fun setOnAdapterEventListener(listener: OnAdapterEventListener) {
        onAdapterEventListener = listener
    }
}