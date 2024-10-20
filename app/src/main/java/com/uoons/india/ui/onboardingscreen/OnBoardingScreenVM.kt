package com.uoons.india.ui.onboardingscreen

import com.uoons.india.ui.base.BaseViewModel

class OnBoardingScreenVM: BaseViewModel<OnBoardingScreenNavigator>() {
    fun naviGateToHomeActivity(){
        navigator?.navigateToHomeActivity()
    }
}