package com.uoons.india.ui.category.category_items.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class FiltersModel(@SerializedName("parentFilterId" ) var parentFilterId : String?        = null,
                        @SerializedName("childIds"       ) var childIds       : ArrayList<ChildIds> = arrayListOf())