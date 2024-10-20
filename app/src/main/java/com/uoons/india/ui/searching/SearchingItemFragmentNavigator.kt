package com.uoons.india.ui.searching

import com.uoons.india.ui.base.CommonNavigator

interface SearchingItemFragmentNavigator : CommonNavigator{
    fun naviGateToSearchItemsFragment(searchKey : String)
}