package com.uoons.india.ui.rate_us

import com.uoons.india.ui.base.BaseViewModel
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
class RateUsBottomSheetVM : BaseViewModel<RateUsBottomSheetNavigator>(){
    fun dismissDialog(){
        navigator!!.dismissDialog()
    }
}