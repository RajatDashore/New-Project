package com.uoons.india.ui.searching.search_items

import com.uoons.india.ui.base.CommonNavigator
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface SearchItemsFragmentNavigator : CommonNavigator{
    fun getAllSSearchItemsData()
}