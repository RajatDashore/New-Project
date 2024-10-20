package com.uoons.india.ui.checkout.checkout_address

import com.uoons.india.ui.base.CommonNavigator
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface CheckOutAddressFragmentNavigator : CommonNavigator{
    fun naviGateToCheckOutPaymentFragment()
    fun getAllDeliverAddressResponse()
    fun getAllDeliverAddressNotFound()
    fun insertDeliverAddressResponse()
     fun deleteDeliverAddressResponse()


}