package com.uoons.india.ui.home.fragment.model

import com.google.gson.annotations.SerializedName

data class HomePageDataModel(
    @SerializedName("status"  ) var status  : String?         = null,
    @SerializedName("message" ) var message : String?         = null,
    @SerializedName("Data"    ) var Data    : ArrayList<Data> = arrayListOf()
)