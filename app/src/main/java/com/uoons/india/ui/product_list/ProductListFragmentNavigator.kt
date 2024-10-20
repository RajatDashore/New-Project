package com.uoons.india.ui.product_list

import com.uoons.india.ui.base.CommonNavigator
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface ProductListFragmentNavigator : CommonNavigator{
    fun productListResponse()
    fun getMyCartItemsResponse()
    fun getWishListResponse()

}