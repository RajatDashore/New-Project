package com.uoons.india.ui.language

import com.uoons.india.ui.base.BaseViewModel
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
class SelectLanguageVM: BaseViewModel<SelectLanguageNavigator>() {
    fun naviGateToAppInformationActivity(){
        navigator?.naviGateToAppInformationActivity()
    }
}