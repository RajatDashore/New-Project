package com.uoons.india.ui.home

import com.uoons.india.ui.base.CommonNavigator
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface HomeActivityNavigator : CommonNavigator {
    fun onCartClick()
}