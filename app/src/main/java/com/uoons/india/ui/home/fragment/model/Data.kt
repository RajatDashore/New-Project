package com.uoons.india.ui.home.fragment.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class Data(
    @SerializedName("name"  ) var name  : String?          = null,
    @SerializedName("id"    ) var id    : Int?             = null,
    @SerializedName("items" ) var items : ArrayList<Items> = arrayListOf()
)
