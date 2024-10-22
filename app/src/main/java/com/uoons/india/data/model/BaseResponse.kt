package com.uoons.india.data.model

import com.google.gson.annotations.SerializedName

data class BaseResponse<T>(
    @SerializedName("Data")
    val Data: T?= null,
    @SerializedName("message")
    val message: String? = null,
    @SerializedName("status")
    val status: String? = null ,
    @SerializedName("code")
    val code: Int? = null
)