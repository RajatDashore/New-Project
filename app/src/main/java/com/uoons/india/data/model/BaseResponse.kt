package com.uoons.india.data.model

import com.google.gson.annotations.SerializedName

data class BaseResponse<T>(
    @SerializedName("Data")
    val Data: T,
    @SerializedName("message")
    val message: String = "",
    @SerializedName("status")
    val status: String ,
    @SerializedName("code")
    val code: Int
)