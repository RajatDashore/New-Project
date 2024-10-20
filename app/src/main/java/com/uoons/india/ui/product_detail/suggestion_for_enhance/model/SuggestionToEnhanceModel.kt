package com.uoons.india.ui.product_detail.suggestion_for_enhance.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class SuggestionToEnhanceModel(@SerializedName("status" ) var status : String? = null,
                                    @SerializedName("data"   ) var data   : SuggestionData?   = SuggestionData(),
                                    @SerializedName("code"   ) var code   : Int?    = null)
