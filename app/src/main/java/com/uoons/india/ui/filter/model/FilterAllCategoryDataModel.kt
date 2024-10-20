package com.uoons.india.ui.filter.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class FilterAllCategoryDataModel(@SerializedName("titleType"   ) var titleType   : String?     = null,
                                      @SerializedName("titleTypeId" ) var titleTypeId : Int?        = null,
                                      @SerializedName("Items"       ) var Items       : ArrayList<FilterItemsDataModel> = arrayListOf())