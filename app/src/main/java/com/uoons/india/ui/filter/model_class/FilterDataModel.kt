package com.uoons.india.ui.filter.model_class

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class FilterDataModel(@SerializedName("status"  ) var status  : String?    = null,
                           @SerializedName("message" ) var message : String?    = null,
                           @SerializedName("Data"    ) var Data    : ArrayList<FilterData> = arrayListOf(),
                           @SerializedName("code"    ) var code    : Int?       = null)
