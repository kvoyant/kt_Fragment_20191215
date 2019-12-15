package com.yhkim.kt_fragment_20191215

import androidx.appcompat.app.AppCompatActivity
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
    }

    override fun setValues() {
    }

}
