package com.uoons.india.ui.settings

import com.uoons.india.ui.base.BaseViewModel

class SettingsFragmentVM : BaseViewModel<SettingsFragmentNavigator>(){

    fun naviGateToNotificationsSettingsFragment(){
        navigator?.naviGateToNotificationsSettingsFragment()
    }
}