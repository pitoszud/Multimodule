package com.velocip.multimodule.di

import com.velocip.home.HomeAnalyticsInterface
import com.velocip.multimodule.analytics.AppAnalytics
import com.velocip.multimodule.analytics.AppAnalyticsInterface
import com.velocip.settings.SettingsAnalyticsInterface
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun provideAnalytics(): AppAnalyticsInterface {
        return AppAnalytics()
    }

}

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModuleAbstract {

    @Binds
    abstract fun bindSettingsAnalytics(analytics: AppAnalytics): SettingsAnalyticsInterface

    @Binds
    abstract fun bindHomeAnalytics(analytics: AppAnalytics): HomeAnalyticsInterface

}