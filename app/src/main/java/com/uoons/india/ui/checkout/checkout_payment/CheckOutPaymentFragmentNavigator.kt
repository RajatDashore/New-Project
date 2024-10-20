package com.uoons.india.ui.checkout.checkout_payment

import com.uoons.india.ui.base.CommonNavigator
interface CheckOutPaymentFragmentNavigator : CommonNavigator {
    fun naviGateToConfirmPayFragment()
    fun checkOutProductResponse()
    fun getMyCartItemsResponse()
    fun onlineCheckOutProductResponse()
    fun checkOnlinePaymentStatus()
}