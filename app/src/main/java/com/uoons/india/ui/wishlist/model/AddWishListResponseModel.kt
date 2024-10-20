package com.uoons.india.ui.wishlist.model

import com.google.gson.annotations.SerializedName

data class AddWishListResponseModel(@SerializedName("status"  ) var status  : String? = null,
                                    @SerializedName("message" ) var message : String? = null,
                                    @SerializedName("Data"    ) var Data    : Int?    = null,
                                    @SerializedName("code"    ) var code    : Int?    = null)
