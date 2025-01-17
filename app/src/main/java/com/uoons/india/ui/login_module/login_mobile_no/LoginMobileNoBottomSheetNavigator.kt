package com.uoons.india.ui.login_module.login_mobile_no

import com.uoons.india.ui.base.CommonNavigator

interface LoginMobileNoBottomSheetNavigator : CommonNavigator{
    fun sendOTP()
    fun otpResponse()
    fun otpFailureResponse()
    fun dismissDialog()
    fun termAndCondition()
    fun privacyPolicy()
    fun referralCode()
}