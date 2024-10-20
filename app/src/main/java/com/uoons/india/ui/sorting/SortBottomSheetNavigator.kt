package com.uoons.india.ui.sorting

import com.uoons.india.ui.base.CommonNavigator
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface SortBottomSheetNavigator : CommonNavigator {
    fun dismissDialog()
    fun getSortingOptionsResponse()
}