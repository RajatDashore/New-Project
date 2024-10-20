package com.uoons.india.ui.slider

import com.uoons.india.ui.base.CommonNavigator

interface SliderItemsFragmentNavigator : CommonNavigator{
    fun getHomeSliderData()
    fun naviGateToSliderItemsDetailFragment(cId: String)
}