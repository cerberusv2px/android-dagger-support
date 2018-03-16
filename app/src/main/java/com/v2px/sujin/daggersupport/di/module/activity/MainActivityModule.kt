package com.v2px.sujin.daggersupport.di.module.activity

import com.v2px.sujin.daggersupport.di.scope.PerActivity
import com.v2px.sujin.daggersupport.di.scope.PerApplication
import com.v2px.sujin.daggersupport.main.MainActivity
import com.v2px.sujin.daggersupport.main.MainContract
import com.v2px.sujin.daggersupport.main.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    @PerActivity
    internal fun provideMainView(mainActivity: MainActivity): MainContract.View {
        return mainActivity
    }

    @Provides
    @PerActivity
    internal fun provideMainPresenter(view: MainContract.View): MainContract.Presenter {
        return MainPresenter(view)
    }
}