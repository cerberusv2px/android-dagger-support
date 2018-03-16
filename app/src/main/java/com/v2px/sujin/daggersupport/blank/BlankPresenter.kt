package com.v2px.sujin.daggersupport.blank


class BlankPresenter(val view: BlankContract.View) : BlankContract.Presenter {
    override fun onTextChange() {
        view.textChange()
    }

    override fun onButtonClick() {
        view.buttonClick()
    }

}