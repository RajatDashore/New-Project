package com.uoons.india.utils

import com.uoons.india.ui.category.model.AllCategoryModel

object CategoryDataSingleton {
    private var allCategoryData: AllCategoryModel? = null
    fun setAllCategoryData(allCategoryData: AllCategoryModel?) {

        this.allCategoryData = allCategoryData
    }

    fun getAllCategoryData(): AllCategoryModel? {

        return allCategoryData

    }

}