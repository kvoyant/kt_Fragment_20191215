package com.yhkim.kt_fragment_20191215.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.yhkim.kt_fragment_20191215.fragments.FirstFragment
import com.yhkim.kt_fragment_20191215.fragments.SecondFragment

class MainViewPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
//        if(position == 0) {
//            return FirstFragment()
//        }
//        else {
//            return SecondFragment()
//        }

        //kotlin syntax change ~
        return when(position) {
            0 -> { FirstFragment() }
            else -> { SecondFragment() }
        }
    }

    override fun getCount(): Int {
        return 2
    }

}