package com.uoons.india.ui.product_detail.suggestion_for_enhance.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class PostSuggestionFeedbackQuestion(@SerializedName("feedback_question" ) var feedbackQuestion : String? = null,
                                          @SerializedName("feedback_answer"   ) var feedbackAnswer   : String? = null)
