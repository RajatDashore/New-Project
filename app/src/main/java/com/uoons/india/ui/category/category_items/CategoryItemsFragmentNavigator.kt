package com.uoons.india.ui.category.category_items

import com.uoons.india.ui.base.CommonNavigator
interface CategoryItemsFragmentNavigator : CommonNavigator{
    fun naviGateToCategoryItemsDetailFragment(pid: String)
    fun getAllSubCategoriesData()
    fun getAllSortingData()
}