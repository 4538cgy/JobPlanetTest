package com.example.jobplanettest.data.type

sealed class TestDataItemType {
    object CELL_TYPE_COMPANY : TestDataItemType()
    object CELL_TYPE_HORIZONTAL_THEME : TestDataItemType()
    object CELL_TYPE_REVIEW : TestDataItemType()
}