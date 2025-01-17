package com.uoons.india.ui.my_cart.model

import com.google.gson.annotations.SerializedName

data class AddQuantityModelResponse(@SerializedName("status"  ) var status  : String? = null,
                                    @SerializedName("message" ) var message : String? = null,
                                    @SerializedName("Data"    ) var Data    : Boolean? = null,
                                    @SerializedName("code"    ) var code    : Int?    = null
)
