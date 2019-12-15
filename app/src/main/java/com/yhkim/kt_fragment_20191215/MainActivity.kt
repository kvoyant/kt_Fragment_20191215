package com.yhkim.kt_fragment_20191215

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        firstFragBtn.setOnClickListener {
            firstLayout.visibility = View.VISIBLE
            secondLayout.visibility = View.GONE
        }

        secondFragBtn.setOnClickListener {
            firstLayout.visibility = View.GONE
            secondLayout.visibility = View.VISIBLE
        }

        //android change fragment 검색요망 (방법이 위와 틀림) replace commit()...정석방법
        //위방법이 정석보다 동작이 빠름(편법 코드, 실무 적용)
    }

    override fun setValues() {
    }

}
