package com.uoons.india.ui.refferal_code.enter_code

import com.uoons.india.ui.base.BaseViewModel
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
class EnterRefferalCodeFragmentVM : BaseViewModel<EnterRefferalCodeFragmentNavigatore>(){
    fun dismissDialog(){
        navigator!!.dismissDialog()
    }
}