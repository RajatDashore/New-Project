package com.uoons.india.ui.checkout.confirm_pay

import com.uoons.india.ui.base.BaseViewModel

class ConfirmPayFragmentVM : BaseViewModel<ConfirmPayFragmentNavigator>()  {
    fun naviGateToHomeFragment(){
        navigator?.naviGateToHomeFragment()
    }
}