package com.uoons.india.ui.filter.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class ChildIds( @SerializedName("id" ) var id : String? = null)
