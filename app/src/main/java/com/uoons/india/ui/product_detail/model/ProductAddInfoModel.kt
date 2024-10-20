package com.uoons.india.ui.product_detail.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class ProductAddInfoModel(   @SerializedName("title"       ) var title       : String? = null,
                                  @SerializedName("description" ) var description : String? = null)
