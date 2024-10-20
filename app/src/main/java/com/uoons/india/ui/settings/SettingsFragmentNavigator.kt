package com.uoons.india.ui.settings

import com.uoons.india.ui.base.CommonNavigator
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface SettingsFragmentNavigator : CommonNavigator{
    fun naviGateToNotificationsSettingsFragment()
}