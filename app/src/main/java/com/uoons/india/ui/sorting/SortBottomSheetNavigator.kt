package com.uoons.india.ui.sorting

import com.uoons.india.ui.base.CommonNavigator

interface SortBottomSheetNavigator : CommonNavigator {
    fun dismissDialog()
    fun getSortingOptionsResponse()
}