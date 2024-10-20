package com.uoons.india.ui.order

import com.uoons.india.ui.base.CommonNavigator

interface OrderBundleFragmentNavigator : CommonNavigator{
    fun naviGateToHomeDehsBoardFragment()
    fun bundleOrdersListResponse()
    fun bundleOrdersListFailureResponse()
    fun getMyCartItemsResponse()
    fun getWishListResponse()
}