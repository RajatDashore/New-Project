package com.uoons.india.ui.help.view_pager_fragment.model

import com.google.gson.annotations.SerializedName

data class FAQListDataModel(@SerializedName("id"         ) var id        : String? = null,
                            @SerializedName("question"   ) var question  : String? = null,
                            @SerializedName("answer"     ) var answer    : String? = null,
                            @SerializedName("type"       ) var type      : String? = null,
                            @SerializedName("created_at" ) var createdAt : String? = null)
