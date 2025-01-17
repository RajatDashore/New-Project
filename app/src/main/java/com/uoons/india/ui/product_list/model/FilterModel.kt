package com.uoons.india.ui.product_list.model

import com.google.gson.annotations.SerializedName

data class FilterModel(@SerializedName("name"  ) var name  : String?          = null,
                       @SerializedName("id"    ) var id    : Int?             = null,
                       @SerializedName("items" ) var items : ArrayList<FilterItemsListModel> = arrayListOf())
