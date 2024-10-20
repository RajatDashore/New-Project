package com.uoons.india.ui.profile.editprofile.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class SaveUserDetailsResponse(
    @SerializedName("status") var status: String? = null,
    @SerializedName("message") var message: String? = null,
    @SerializedName("Data") var Data: String? = null,
    @SerializedName("code") var code: Int? = null
)
