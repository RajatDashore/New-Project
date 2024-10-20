package com.uoons.india.ui.order.order_list.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class OrderBundleListModel(@SerializedName("status"  ) var status  : String?         = null,
                                @SerializedName("message" ) var message : String?         = null,
                                @SerializedName("Data"    ) var Data    : ArrayList<OrderListModel> = arrayListOf(),
                                @SerializedName("code"    ) var code    : Int?            = null)