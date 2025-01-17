package com.uoons.india.utils

import com.uoons.india.ui.home.fragment.model.DeshBoardModel
import com.uoons.india.ui.home.fragment.more_products.model.MoreProducts

object DashBoardDataListSingleton {

    private var dashBoardData: DeshBoardModel? = null
    private var moreProductsItemList: ArrayList<MoreProducts> = ArrayList<MoreProducts>()


    fun setDastBoardData(dashBoardData: DeshBoardModel?) {
        this.dashBoardData = dashBoardData
    }

    fun setMoreProductsItemList(moreProductsItemList: ArrayList<MoreProducts>) {

        this.moreProductsItemList = moreProductsItemList
    }

    fun getDastBoardData(): DeshBoardModel? {
        return dashBoardData
    }

    fun getMoreProductsItemList(): ArrayList<MoreProducts> {
        return moreProductsItemList
    }
}