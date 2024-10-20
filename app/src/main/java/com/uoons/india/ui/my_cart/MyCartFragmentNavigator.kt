package com.uoons.india.ui.my_cart

import com.uoons.india.ui.base.CommonNavigator
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface MyCartFragmentNavigator : CommonNavigator{
    fun naviGateToCheckOutAddressFragment()
    fun getMyCartItemsResponse()
    fun removeCartItemResponse()
    fun naviGateToHomeDehsBoardFragment()
    fun checkCoupenCode()
    fun coupenCodeResponse()
    fun checkProductListCart()
    fun getMyCartItemsFailureResponse()
}