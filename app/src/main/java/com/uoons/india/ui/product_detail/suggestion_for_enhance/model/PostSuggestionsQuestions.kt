package com.uoons.india.ui.product_detail.suggestion_for_enhance.model

import com.google.gson.annotations.SerializedName

data class PostSuggestionsQuestions(@SerializedName("question" ) var question : String? = null,
                                    @SerializedName("answer"   ) var answer   : String? = null)
