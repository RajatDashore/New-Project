package com.uoons.india.ui.splash

import com.uoons.india.ui.base.CommonNavigator
import com.uoons.india.ui.splash.model.ForceUpdatedModel
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface SplashNavigator : CommonNavigator {
    fun moveToNextScreen()
    fun getForceUpdateResponse(forceUpdatedModel : ForceUpdatedModel)
}
