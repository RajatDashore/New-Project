package com.uoons.india.ui.profile.editprofile.model

import com.google.gson.annotations.SerializedName

data class ProfileImageModel(@SerializedName("status"  ) var status  : Boolean? = null,
                             @SerializedName("message" ) var message : String?  = null,
                             @SerializedName("Data"    ) var Data    : ProfileImageResponseDataModel?    = ProfileImageResponseDataModel(),
                             @SerializedName("code"    ) var code    : Int?     = null)
