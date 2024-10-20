package com.uoons.india.ui.refferal_code

import com.uoons.india.ui.base.BaseViewModel
import com.uoons.india.ui.rate_us.RateUsBottomSheetNavigator
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
class MyRefferalCodeFragmentVM : BaseViewModel<MyRefferalCodeFragmentNavigator>(){
    fun dismissDialog(){
        navigator!!.dismissDialog()
    }
}