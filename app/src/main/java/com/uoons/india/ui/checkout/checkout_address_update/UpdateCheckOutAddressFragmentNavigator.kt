package com.uoons.india.ui.checkout.checkout_address_update

import com.uoons.india.ui.base.CommonNavigator

interface UpdateCheckOutAddressFragmentNavigator : CommonNavigator{
    fun naviGateToCheckOutPaymentFragment()

    fun updateDeliverAddressApiCall()


}