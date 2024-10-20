package com.uoons.india.ui.order.order_details.model

import com.google.gson.annotations.SerializedName

data class OrderDetailModel(@SerializedName("status"  ) var status  : String? = null,
                            @SerializedName("message" ) var message : String? = null,
                            @SerializedName("Data"    ) var Data    : OrderDetails?   = OrderDetails(),
                            @SerializedName("code"    ) var code    : Int?    = null)