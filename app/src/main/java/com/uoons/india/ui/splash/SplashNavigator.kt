package com.uoons.india.ui.splash

import com.uoons.india.ui.base.CommonNavigator
import com.uoons.india.ui.splash.model.ForceUpdatedModel

interface SplashNavigator : CommonNavigator {
    fun moveToNextScreen()
    fun getForceUpdateResponse(forceUpdatedModel : ForceUpdatedModel)
}
