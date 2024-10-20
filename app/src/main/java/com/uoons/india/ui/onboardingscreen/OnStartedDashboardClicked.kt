package com.uoons.india.ui.onboardingscreen

import android.view.View
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface OnStartedDashboardClicked {
    fun onGetStartDashBoardClicked(position: Int, view: View, value: String)
}