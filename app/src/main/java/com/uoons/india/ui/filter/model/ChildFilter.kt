package com.uoons.india.ui.filter.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class ChildFilter(@SerializedName("id"   ) var id   : String? = null,
                       @SerializedName("name" ) var name : String? = null)
