package com.uoons.india.ui.profile

import com.uoons.india.ui.base.CommonNavigator
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface ProfileFrgamentNavigator: CommonNavigator {
    fun naviGateToEditProfileFragment()
    fun getUserDetailsData()
}