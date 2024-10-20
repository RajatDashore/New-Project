package com.uoons.india.ui.onboardingscreen

import com.uoons.india.ui.base.BaseViewModel
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
class OnBoardingScreenVM: BaseViewModel<OnBoardingScreenNavigator>() {
    fun naviGateToHomeActivity(){
        navigator?.navigateToHomeActivity()
    }
}