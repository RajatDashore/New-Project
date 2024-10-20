package com.uoons.india.ui.profile.editprofile

import com.uoons.india.ui.base.CommonNavigator
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
interface EditProfileFrgamentNavigator : CommonNavigator {
    fun saveUserData()
    fun saveUserDetailResponse()
    fun opneGalleryCamera()
    fun saveUserProfileImageResponse()
    fun getUserDetailsData()
}
