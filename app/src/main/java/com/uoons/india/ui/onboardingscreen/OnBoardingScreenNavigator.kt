package com.uoons.india.ui.onboardingscreen

import com.uoons.india.ui.base.CommonNavigator
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface OnBoardingScreenNavigator: CommonNavigator {
    fun navigateToHomeActivity()
}