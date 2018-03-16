package com.v2px.sujin.daggersupport.blank


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.v2px.sujin.daggersupport.R
import dagger.android.AndroidInjection
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_blank.*
import javax.inject.Inject


/**
 * A simple [Fragment] subclass.
 */
class BlankFragment : Fragment(), BlankContract.View {

    @Inject
    lateinit var blankPresenter: BlankContract.Presenter

    override fun buttonClick() {
        blankPresenter.onTextChange()
    }

    override fun textChange() {
        textView2.text = "Fragment dagger test"
    }

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        button3.setOnClickListener { blankPresenter.onButtonClick() }
    }

}// Required empty public constructor
