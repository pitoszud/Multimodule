package com.velocip.multimodule

import androidx.lifecycle.ViewModel
import com.velocip.multimodule.analytics.AppAnalyticsInterface
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val appAnalytics: AppAnalyticsInterface
) : ViewModel() {

    init {
        appAnalytics.logEvent("MainViewModel created")
    }
}