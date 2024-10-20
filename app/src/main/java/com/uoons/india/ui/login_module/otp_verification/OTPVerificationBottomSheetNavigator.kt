package com.uoons.india.ui.login_module.otp_verification

import com.uoons.india.ui.base.CommonNavigator
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface OTPVerificationBottomSheetNavigator : CommonNavigator {
    fun verifyOTP()
    fun otpVerifyResponse()
    fun otpFaluireResponse()
    fun dismissDialog()
    fun reSendOTP()
    fun resentOTPResponse()
}