package com.v2px.sujin.daggersupport.di.component.fragment

import com.v2px.sujin.daggersupport.blank.BlankFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent
interface BlankFragmentSubComponent : AndroidInjector<BlankFragment> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<BlankFragment>()
}