package com.uoons.india.ui.home.fragment.more_products.model

import com.google.gson.annotations.SerializedName

data class HomePageMoreItemsDataModel(@SerializedName("status" ) var status : String? = null,
                                      @SerializedName("data"   ) var data   : MoreData?   = MoreData()
)
