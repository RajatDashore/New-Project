package com.uoons.india.ui.refferal_code

import com.uoons.india.ui.base.BaseViewModel
import com.uoons.india.ui.rate_us.RateUsBottomSheetNavigator

class MyRefferalCodeFragmentVM : BaseViewModel<MyRefferalCodeFragmentNavigator>(){
    fun dismissDialog(){
        navigator!!.dismissDialog()
    }
}