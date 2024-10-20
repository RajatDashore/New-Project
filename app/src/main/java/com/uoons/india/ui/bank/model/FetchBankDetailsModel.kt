package com.uoons.india.ui.bank.model

import com.google.gson.annotations.SerializedName

data class FetchBankDetailsModel(@SerializedName("status"  ) var status  : String?         = null,
                                 @SerializedName("message" ) var message : String?         = null,
                                 @SerializedName("Data"    ) var Data    : ArrayList<BankDetailsList> = arrayListOf(),
                                 @SerializedName("code"    ) var code    : Int?            = null)