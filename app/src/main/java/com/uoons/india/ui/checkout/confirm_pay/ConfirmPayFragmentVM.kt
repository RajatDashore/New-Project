package com.uoons.india.ui.checkout.confirm_pay

import com.uoons.india.ui.base.BaseViewModel
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
class ConfirmPayFragmentVM : BaseViewModel<ConfirmPayFragmentNavigator>()  {
    fun naviGateToHomeFragment(){
        navigator?.naviGateToHomeFragment()
    }
}