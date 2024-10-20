package com.uoons.india.ui.category

import com.uoons.india.ui.base.CommonNavigator
interface CategoryFragmentNavigator : CommonNavigator {
    fun naviGateToCategoryItemsFragment(cId: String, cName: String)
    fun getAllCategoriesData()
    fun getMyCartItemsResponse()
    fun getWishListResponse()
}