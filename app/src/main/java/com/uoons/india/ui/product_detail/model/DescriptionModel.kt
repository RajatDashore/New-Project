package com.uoons.india.ui.product_detail.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class DescriptionModel(@SerializedName("description" ) var description : String?           = null,
                            @SerializedName("images"      ) var images      : ArrayList<ImagesArrayListModel> = arrayListOf())
