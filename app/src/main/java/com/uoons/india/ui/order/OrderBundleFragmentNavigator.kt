package com.uoons.india.ui.order

import com.uoons.india.ui.base.CommonNavigator
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface OrderBundleFragmentNavigator : CommonNavigator{
    fun naviGateToHomeDehsBoardFragment()
    fun bundleOrdersListResponse()
    fun bundleOrdersListFailureResponse()
    fun getMyCartItemsResponse()
    fun getWishListResponse()
}