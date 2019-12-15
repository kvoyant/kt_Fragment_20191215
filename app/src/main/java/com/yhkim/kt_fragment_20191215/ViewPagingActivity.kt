package com.yhkim.kt_fragment_20191215

import android.os.Bundle
import com.yhkim.kt_fragment_20191215.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_view_paging.*

class ViewPagingActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_paging)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        mainViewPager.adapter = MainViewPagerAdapter(supportFragmentManager)

        mainTabLayout.setupWithViewPager(mainViewPager)
    }

}
