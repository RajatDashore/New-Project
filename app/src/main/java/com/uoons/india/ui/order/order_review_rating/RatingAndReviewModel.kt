package com.uoons.india.ui.order.order_review_rating

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class RatingAndReviewModel(
    @SerializedName("status") var status: String? = null,
    @SerializedName("message") var message: String? = null,
    @SerializedName("Data") var Data: Int? = null,
    @SerializedName("code") var code: Int? = null
)
