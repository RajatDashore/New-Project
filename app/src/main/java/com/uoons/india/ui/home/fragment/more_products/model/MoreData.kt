package com.uoons.india.ui.home.fragment.more_products.model

import com.google.gson.annotations.SerializedName

data class MoreData(@SerializedName("products"     ) var products    : ArrayList<MoreProducts> = arrayListOf(),
                    @SerializedName("page"         ) var page        : Int?                = null,
                    @SerializedName("current_page" ) var currentPage : String?             = null,
                    @SerializedName("total_items"  ) var totalItems  : Int?                = null)
