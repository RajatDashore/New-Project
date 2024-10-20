package com.uoons.india.ui.login_module.otp_verification

import com.uoons.india.ui.base.CommonNavigator

interface OTPVerificationBottomSheetNavigator : CommonNavigator {
    fun verifyOTP()
    fun otpVerifyResponse()
    fun otpFaluireResponse()
    fun dismissDialog()
    fun reSendOTP()
    fun resentOTPResponse()
}