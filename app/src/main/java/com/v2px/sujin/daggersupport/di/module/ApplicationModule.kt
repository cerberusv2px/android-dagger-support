package com.v2px.sujin.daggersupport.di.module

import android.app.Application
import android.content.Context
import com.v2px.sujin.daggersupport.di.scope.PerApplication
import dagger.Module
import dagger.Provides


@Module
class ApplicationModule {

    @Provides
    @PerApplication
    fun provideContext(application: Application): Context {
        return application
    }
}