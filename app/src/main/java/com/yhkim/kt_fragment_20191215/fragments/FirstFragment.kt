package com.yhkim.kt_fragment_20191215.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.yhkim.kt_fragment_20191215.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : BaseFragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupEvents()
        setupValues()
    }

    override fun setupEvents() {
        okBtn.setOnClickListener {
            //내가 누구? mContext => activity => activity(BaseFragment 수정후 )
            Toast.makeText(mContext, "${nameEdt.text.toString()}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun setupValues() {
    }

}