package com.uoons.india.ui.help.view_pager_fragment

import com.uoons.india.ui.base.CommonNavigator
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface FAQFragmentNavigator : CommonNavigator{
    fun getAllFAQData()
}