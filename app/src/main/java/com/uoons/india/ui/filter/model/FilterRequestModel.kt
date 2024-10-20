package com.uoons.india.ui.filter.model

import com.google.gson.annotations.SerializedName

data class FilterRequestModel(@SerializedName("parentFilterId" ) var parentFilterId : Int       ,
                              @SerializedName("childIds"       ) var childIds       : ArrayList<ChildIds> = arrayListOf())
