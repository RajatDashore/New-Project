package com.uoons.india.ui.profile.model

import com.google.gson.annotations.SerializedName
data class UserDetailsModel(
    @SerializedName("status") var status: String? = null,
    @SerializedName("code") var code: Int? = null,
    @SerializedName("message") var message: String? = null,
    @SerializedName("Data") var Data: List<UserDetailsModelClass> = arrayListOf()
)
