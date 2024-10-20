package com.uoons.india.ui.refferal_code.enter_code

import com.uoons.india.ui.base.CommonNavigator
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface EnterRefferalCodeFragmentNavigatore : CommonNavigator{
    fun dismissDialog()
    fun submitRefferalCode()
}