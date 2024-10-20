package com.uoons.india.ui.bank.model

import com.google.gson.annotations.SerializedName
data class SaveBankDetailsModel(@SerializedName("status"  ) var status  : String? = null,
                                @SerializedName("message" ) var message : String? = null,
                                @SerializedName("data"    ) var data    : Int?    = null,
                                @SerializedName("code"    ) var code    : Int?    = null)