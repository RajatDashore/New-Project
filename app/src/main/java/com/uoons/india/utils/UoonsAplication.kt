package com.uoons.india.utils

import android.app.Application
import androidx.lifecycle.LifecycleObserver
import com.uoons.india.data.local.AppPreference

class UoonsAplication: Application() ,LifecycleObserver{
    override fun onCreate() {
        super.onCreate()
        instance = this
        AppPreference.getInstance(this)


    }
    companion object {
        @get:Synchronized
        var instance: UoonsAplication? = null
            private set
    }
}