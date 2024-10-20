package com.uoons.india.ui.filter.model

import com.google.gson.annotations.SerializedName

data class FilterDataCutomModel(@SerializedName("parentId"   ) var parentId   : String?    = null,
                                @SerializedName("childId" ) var childId : String? = null)