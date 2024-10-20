package com.uoons.india.ui.filter.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class FilterItemsDataModel(@SerializedName("itemId"   ) var itemId   : Int?    = null,
                                @SerializedName("itemName" ) var itemName : String? = null)

