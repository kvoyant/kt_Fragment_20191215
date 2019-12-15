package com.yhkim.kt_fragment_20191215.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.yhkim.kt_fragment_20191215.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment(){


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        okBtn.setOnClickListener {
            //내가 누구? mContext => activity
            Toast.makeText(activity, "${nameEdt.text.toString()}", Toast.LENGTH_SHORT).show()
        }

    }
}