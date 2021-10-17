package com.example.jobplanettest.data.type

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import com.example.jobplanettest.R
import com.example.jobplanettest.adapter.base.BaseViewHolder
import com.example.jobplanettest.adapter.flexviewholder.CompanyFlexViewHolder
import com.example.jobplanettest.adapter.flexviewholder.HorizontalFlexThemeViewHolder
import com.example.jobplanettest.adapter.flexviewholder.ReviewFlexViewHolder
import com.example.jobplanettest.adapter.flexviewholder.VHNotSupport
import com.example.jobplanettest.adapter.viewholder.EmptyViewHolder
import com.example.jobplanettest.base.BaseItemModel
import java.lang.Exception

class ItemType {

    enum class Type(model: Class<*>? , viewHolder: Class<out BaseViewHolder<*>?>?, resource : Int) {

        CELL_TYPE_COMPANY(CELL_TYPE_COMPANY::class.java,CompanyFlexViewHolder::class.java, R.layout.item_company),
        CELL_TYPE_HORIZONTAL_THEME(CELL_TYPE_HORIZONTAL_THEME::class.java,HorizontalFlexThemeViewHolder::class.java, R.layout.item_horizontal_theme),
        CELL_TYPE_REVIEW(CELL_TYPE_REVIEW::class.java,ReviewFlexViewHolder::class.java, R.layout.item_review),
        NOT_SUPPORT(BaseItemModel::class.java, VHNotSupport::class.java, R.layout.vh_not_support_item);


        private var modelName: Class<*>? = null
        private var viewHolderName: Class<out BaseViewHolder<*>?>? = null
        private var bindingName: Class<out ViewDataBinding?>? = null

        @LayoutRes
        private var xmlName: Int? = null

        fun Type(model: Class<*>?, viewHolder: Class<out BaseViewHolder<*>?>?, xmlName: Int) {
            modelName = model
            viewHolderName = viewHolder
            bindingName = null
            this.xmlName = xmlName
        }

        fun Type(
            model: Class<*>?,
            viewHolder: Class<out BaseViewHolder<*>?>?,
            binding: Class<out ViewDataBinding?>?
        ) {
            modelName = model
            viewHolderName = viewHolder
            bindingName = binding
            xmlName = null
        }

        fun getModel(): Class<*>? {
            return modelName
        }

        fun getXmlId(): Int? {
            return xmlName
        }

        fun getBindingName(): Class<out ViewDataBinding?>? {
            return bindingName
        }

        fun newViewHolderInstance(view: View): BaseViewHolder<*>? {
            return try {
                viewHolderName!!.getConstructor(View::class.java).newInstance(view)
            } catch (e: Exception) {
                e.printStackTrace()
                EmptyViewHolder(view.context)
            }
        }

        fun newViewHolderInstanceDataBindingVer(parent: ViewGroup): BaseViewHolder<*>? {
            return try {
                //inflate 메소드 생성(ex . XXXBINDING.inflate())
                val method = bindingName!!.getMethod(
                    "inflate",
                    LayoutInflater::class.java,
                    ViewGroup::class.java,
                    Boolean::class.javaPrimitiveType
                )
                //inflate 실행
                val bindingView = method.invoke(
                    bindingName,
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                ) as ViewDataBinding
                //viewHolder 생성
                viewHolderName!!.getConstructor(bindingName).newInstance(bindingView)
            } catch (e: ReflectiveOperationException) {
                e.printStackTrace()
                EmptyViewHolder(parent.context)
            }
        }
    }

}