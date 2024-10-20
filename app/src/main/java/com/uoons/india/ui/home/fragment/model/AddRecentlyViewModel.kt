package com.uoons.india.ui.home.fragment.model

import com.google.gson.annotations.SerializedName

data class AddRecentlyViewModel(  @SerializedName("status"  ) var status  : String? = null,
                                  @SerializedName("message" ) var message : String? = null,
                                  @SerializedName("Data"    ) var Data    : Int?    = null,
                                  @SerializedName("code"    ) var code    : Int?    = null)
