package com.v2px.sujin.daggersupport.di.module.provider

import com.v2px.sujin.daggersupport.blank.BlankFragment
import com.v2px.sujin.daggersupport.di.module.fragment.BlankFragmentModule
import com.v2px.sujin.daggersupport.di.scope.PerActivity
import com.v2px.sujin.daggersupport.di.scope.PerFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {

    @PerFragment
    @ContributesAndroidInjector(modules = [(BlankFragmentModule::class)])
    abstract fun bindBlankFragment(): BlankFragment
}