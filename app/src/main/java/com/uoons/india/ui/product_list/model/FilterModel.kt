package com.uoons.india.ui.product_list.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class FilterModel(@SerializedName("name"  ) var name  : String?          = null,
                       @SerializedName("id"    ) var id    : Int?             = null,
                       @SerializedName("items" ) var items : ArrayList<FilterItemsListModel> = arrayListOf())
