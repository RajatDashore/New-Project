package com.uoons.india.ui.language

import com.uoons.india.ui.base.BaseViewModel

class SelectLanguageVM: BaseViewModel<SelectLanguageNavigator>() {
    fun naviGateToAppInformationActivity(){
        navigator?.naviGateToAppInformationActivity()
    }
}