package com.example.jobplanettest.adapter.flexviewholder

import android.app.Activity
import android.os.Build
import android.text.Html
import android.view.View
import android.widget.TextView
import com.example.jobplanettest.R
import com.example.jobplanettest.adapter.base.BaseViewHolder
import com.example.jobplanettest.base.BaseItemModel

class VHNotSupport(itemView: View) : BaseViewHolder<BaseItemModel?>(itemView) {

    override fun onBindView(baseItemModel: BaseItemModel?) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {

        } else {
        }
    }

    override fun onItemClick() {
        TODO("Not yet implemented")
    }


}