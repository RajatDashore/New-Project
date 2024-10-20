package com.uoons.india.ui.settings

import com.uoons.india.ui.base.BaseViewModel
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
class SettingsFragmentVM : BaseViewModel<SettingsFragmentNavigator>(){

    fun naviGateToNotificationsSettingsFragment(){
        navigator?.naviGateToNotificationsSettingsFragment()
    }
}