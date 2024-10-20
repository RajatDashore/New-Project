package com.uoons.india.utils

import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface PropertiChangeListener {
    fun onPropertiChanged(isChanged: Boolean)
}