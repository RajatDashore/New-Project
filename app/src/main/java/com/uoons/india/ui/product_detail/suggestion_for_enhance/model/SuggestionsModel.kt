package com.uoons.india.ui.product_detail.suggestion_for_enhance.model

import com.google.gson.annotations.SerializedName

data class SuggestionsModel(@SerializedName("feedback" ) var feedback : String?             = null,
                            @SerializedName("question" ) var question : ArrayList<QuestionModel> = arrayListOf()
)
