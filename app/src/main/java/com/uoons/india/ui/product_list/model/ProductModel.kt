package com.uoons.india.ui.product_list.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class ProductModel(@SerializedName("status" ) var status : String? = null,
                        @SerializedName("data"   ) var data   : ProductListDataModel?   = ProductListDataModel())
