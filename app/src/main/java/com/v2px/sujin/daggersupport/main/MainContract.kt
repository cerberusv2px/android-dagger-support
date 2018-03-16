package com.v2px.sujin.daggersupport.main

import com.v2px.sujin.daggersupport.BasePresenter
import com.v2px.sujin.daggersupport.BaseView


interface MainContract {

/*    interface View : BaseView<Presenter> {

        fun buttonClick()

        fun textChange()
    }

    interface Presenter : BasePresenter {

        fun onButtonClick()

        fun onTextChange()
    }*/

    interface View  {

        fun buttonClick()

        fun textChange()
    }

    interface Presenter  {

        fun onButtonClick()

        fun onTextChange()
    }
}