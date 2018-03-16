package com.v2px.sujin.daggersupport.di.component

import android.app.Application
import com.v2px.sujin.daggersupport.MyApplication
import com.v2px.sujin.daggersupport.di.module.provider.ActivityBindingModule
import com.v2px.sujin.daggersupport.di.module.ApplicationModule
import com.v2px.sujin.daggersupport.di.scope.PerApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule

@PerApplication
@Component(modules = [
    (ApplicationModule::class),
    (AndroidInjectionModule::class),
    (ActivityBindingModule::class)
])
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }

    fun inject(app: MyApplication)
}