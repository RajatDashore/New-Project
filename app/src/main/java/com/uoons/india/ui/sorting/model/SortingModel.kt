package com.uoons.india.ui.sorting.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class SortingModel(@SerializedName("status"  ) var status  : String?    = null,
                        @SerializedName("message" ) var message : String?    = null,
                        @SerializedName("Data"    ) var Data    : ArrayList<SortingDataModel> = arrayListOf(),
                        @SerializedName("code"    ) var code    : Int?       = null)