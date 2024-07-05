package com.velocip.settings

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class SettingsViewModel @Inject constructor(
    private val settingsAnalytics: SettingsAnalyticsInterface
) : ViewModel() {

    init {
        /*
        * The logEvent implementation is delegated to the AppAnalytics in the app module.
        * This approach allows using app-specific dependencies, which cannot be easily accessed in the submodules.
        * It also allows a centralised way of logging events.
        * */
        settingsAnalytics.logEvent("SettingsViewModel created")
    }
}