package com.uoons.india.ui.filter.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class FilterDataCutomModel(@SerializedName("parentId"   ) var parentId   : String?    = null,
                                @SerializedName("childId" ) var childId : String? = null)