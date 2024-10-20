package com.uoons.india.ui.filter.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class FilterRequestModel(@SerializedName("parentFilterId" ) var parentFilterId : Int       ,
                              @SerializedName("childIds"       ) var childIds       : ArrayList<ChildIds> = arrayListOf())
