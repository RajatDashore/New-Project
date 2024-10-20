package com.uoons.india.ui.product_detail.model

import com.google.gson.annotations.SerializedName

data class ProductAddInfoModel(   @SerializedName("title"       ) var title       : String? = null,
                                  @SerializedName("description" ) var description : String? = null)
