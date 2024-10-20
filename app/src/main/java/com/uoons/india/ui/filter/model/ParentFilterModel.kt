package com.uoons.india.ui.filter.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class ParentFilterModel(@SerializedName("parentId"    ) var parentId    : String?                = null,
                             @SerializedName("childFilter" ) var childFilter : ArrayList<ChildFilter> = arrayListOf())
