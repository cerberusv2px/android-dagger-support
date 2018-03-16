package com.v2px.sujin.daggersupport.di.module.fragment

import com.v2px.sujin.daggersupport.blank.BlankContract
import com.v2px.sujin.daggersupport.blank.BlankFragment
import com.v2px.sujin.daggersupport.blank.BlankPresenter
import com.v2px.sujin.daggersupport.di.scope.PerActivity
import com.v2px.sujin.daggersupport.di.scope.PerFragment
import dagger.Module
import dagger.Provides

@Module
class BlankFragmentModule {

    @Provides
    @PerFragment
    internal fun provideBlankView(fragment: BlankFragment): BlankContract.View {
        return fragment
    }

    @Provides
    @PerFragment
    internal fun provideBlankPresenter(view: BlankContract.View): BlankContract.Presenter {
        return BlankPresenter(view)
    }
}