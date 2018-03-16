package com.v2px.sujin.daggersupport.main


class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {

 /*   init {
        view.setPresenter(this)
    }

    override fun start() {
        TODO("not implemented")
    }

    override fun stop() {
        TODO("not implemented")
    }
*/
    override fun onButtonClick() {
        view.buttonClick()
    }

    override fun onTextChange() {
        view.textChange()
    }
}