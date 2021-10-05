package com.example.jobplanettest.base

import com.example.jobplanettest.data.type.ItemType
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BaseItemModel {
    @SerializedName("item_type")
    @Expose
    private var itemType: String? = null
    private var type: ItemType.Type? = null

    fun BaseItemModel() {
        type = ItemType.Type.NOT_SUPPORT
    }


    fun BaseItemModel(type: ItemType.Type) {
        this.type = type
        itemType = type.name
    }

    fun getType(): ItemType.Type? {
        return type
    }
}