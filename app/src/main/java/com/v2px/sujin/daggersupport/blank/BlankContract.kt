package com.v2px.sujin.daggersupport.blank


interface BlankContract {
    interface View {

        fun buttonClick()

        fun textChange()
    }

    interface Presenter {

        fun onButtonClick()

        fun onTextChange()
    }
}