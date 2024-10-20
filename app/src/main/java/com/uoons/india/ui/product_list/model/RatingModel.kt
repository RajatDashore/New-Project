package com.uoons.india.ui.product_list.model

import com.google.gson.annotations.SerializedName

data class RatingModel( @SerializedName("total"  ) var total  : Int?    = null,
                        @SerializedName("rating" ) var rating : Double? = null)
