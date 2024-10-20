package com.uoons.india.ui.help.view_pager_fragment.model

import com.google.gson.annotations.SerializedName

data class FAQModel(@SerializedName("faqId"      ) var faqId      : Int?    = null,
                    @SerializedName("faqQuation" ) var faqQuation : String? = null,
                    @SerializedName("faqAnswer"  ) var faqAnswer  : String? = null)
