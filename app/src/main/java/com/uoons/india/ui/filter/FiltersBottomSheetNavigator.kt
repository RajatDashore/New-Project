package com.uoons.india.ui.filter

import com.uoons.india.ui.base.CommonNavigator
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface FiltersBottomSheetNavigator : CommonNavigator {
    fun dismissDialog()
    fun doneFilter()
}