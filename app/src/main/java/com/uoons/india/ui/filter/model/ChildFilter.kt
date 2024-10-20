package com.uoons.india.ui.filter.model

import com.google.gson.annotations.SerializedName

data class ChildFilter(@SerializedName("id"   ) var id   : String? = null,
                       @SerializedName("name" ) var name : String? = null)
