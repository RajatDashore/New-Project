package com.uoons.india.ui.home.fragment

import com.uoons.india.ui.base.CommonNavigator

interface HomeFragmentNavigator : CommonNavigator {
    fun naviGateToProductDetail(pId : String)
    fun naviGateToCategoryItemsFragment(subID: String, parentID: String, categoryName: String)
    fun naviGateToSliderItemsFragment(cId : String)
    fun getDeshBoardData()
    fun getDeshBoardMoreProductsData()
  //  fun addRecentlyViewProductResponse()
}