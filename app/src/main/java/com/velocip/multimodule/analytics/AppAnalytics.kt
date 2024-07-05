package com.velocip.multimodule.analytics

import android.util.Log
import javax.inject.Inject

class AppAnalytics @Inject constructor() : AppAnalyticsInterface {

    override fun logEvent(event: String) {
        Log.d("AppAnalytics", "Logged event: $event")
    }
}


interface AppAnalyticsInterface {
    fun logEvent(event: String)
}