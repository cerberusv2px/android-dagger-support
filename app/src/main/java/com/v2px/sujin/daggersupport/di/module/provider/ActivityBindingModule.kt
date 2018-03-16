package com.v2px.sujin.daggersupport.di.module.provider

import com.v2px.sujin.daggersupport.di.module.activity.MainActivityModule
import com.v2px.sujin.daggersupport.di.scope.PerActivity
import com.v2px.sujin.daggersupport.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBindingModule {

    @PerActivity
    @ContributesAndroidInjector(modules = [
        (MainActivityModule::class), (FragmentBindingModule::class)])
    abstract fun bindMainActivity(): MainActivity
}