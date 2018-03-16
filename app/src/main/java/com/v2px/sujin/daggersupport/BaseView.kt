package com.v2px.sujin.daggersupport


interface BaseView<in T : BasePresenter> {
    fun setPresenter(presenter: T)
}