package com.uoons.india.ui.splash

import com.uoons.india.ui.splash.model.ForceUpdateData
import com.uoons.india.ui.splash.model.ForceUpdatedModel

import retrofit2.Call
import retrofit2.http.*

interface ApiInterface {


    @GET("api/forceUpdate")
    fun getUserList(@Header("Channel-Code") ChannelCode: String,@Query("versionCode") versionCode: String): Call<ForceUpdateData>


      fun checkAPKUpdatedVersion(@Header("Channel-Code") ChannelCode: String,@Query("versionCode") versionCode: String) : ForceUpdatedModel


}