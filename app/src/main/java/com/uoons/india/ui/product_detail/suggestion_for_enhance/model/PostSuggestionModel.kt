package com.uoons.india.ui.product_detail.suggestion_for_enhance.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class PostSuggestionModel(@SerializedName("questions"         ) var questions        : ArrayList<PostSuggestionsQuestions> = arrayListOf(),
                               @SerializedName("feedback_question" ) var feedbackQuestion : PostSuggestionFeedbackQuestion?    = PostSuggestionFeedbackQuestion())