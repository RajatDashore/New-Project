package com.uoons.india.ui.category.category_items.category_items_details.model

import com.google.gson.annotations.SerializedName
data class AddItemToCartDataResponse(  @SerializedName("status"  ) var status  : String?  = null,
                                       @SerializedName("message" ) var message : String?  = null,
                                       @SerializedName("Data"    ) var Data    : Boolean? = null,
                                       @SerializedName("code"    ) var code    : Int?     = null)
