package com.example.jobplanettest.data.base

import com.example.jobplanettest.data.type.ItemType
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

open class BaseItemModel {

    @SerializedName("item_type")
    @Expose
    private var itemType: String? = null
    private var type: ItemType.Type? = null

    @SerializedName("deep_link_url")
    @Expose
    private var deepLink: String? = null

    private var childItems = LinkedList<BaseItemModel>()

    fun getChildItems(): LinkedList<BaseItemModel>? {
        return childItems
    }

    fun setChildItems(childItems: LinkedList<BaseItemModel>) {
        this.childItems = childItems
    }

    /*
    fun BaseItemModel() {
        type = ItemType.Type.NOT_SUPPORT
    }

     */


    fun BaseItemModel(type: ItemType.Type) {
        this.type = type
        itemType = type.name
    }

    fun setItemType(itemType: String?) {
        this.itemType = itemType
    }

    fun getItemType(): String? {
        return itemType
    }

    fun getType(): ItemType.Type? {
        return type
    }

    fun setType(type: ItemType.Type?) {
        this.type = type
    }

    fun getDeepLink(): String? {
        return deepLink
    }

    fun setDeepLink(deepLink: String?) {
        this.deepLink = deepLink
    }
}