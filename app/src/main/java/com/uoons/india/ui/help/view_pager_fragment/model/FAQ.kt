package com.uoons.india.ui.help.view_pager_fragment.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class FAQ(@SerializedName("Faq" ) var Faq : ArrayList<FAQModel> = arrayListOf())