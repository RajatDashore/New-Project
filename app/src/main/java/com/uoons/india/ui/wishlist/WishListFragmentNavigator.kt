package com.uoons.india.ui.wishlist

import com.uoons.india.ui.base.CommonNavigator
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface WishListFragmentNavigator : CommonNavigator{
    fun getWishListResponse()
    fun getWishListFailureResponse()
    fun removeWishListItemResponse()
    fun naviGateToHomeDehsBoardFragment()
}