package com.uoons.india.ui.home.fragment.model

import com.google.gson.annotations.SerializedName
data class DeshBoardData(@SerializedName("name"  ) var name  : String?          = null,
                         @SerializedName("id"    ) var id    : Int?             = null,
                         @SerializedName("items" ) var items : ArrayList<DeshBoardItems> = arrayListOf())
