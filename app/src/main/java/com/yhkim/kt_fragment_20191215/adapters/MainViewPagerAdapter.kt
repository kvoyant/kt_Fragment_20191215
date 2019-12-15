package com.yhkim.kt_fragment_20191215.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.yhkim.kt_fragment_20191215.fragments.FirstFragment
import com.yhkim.kt_fragment_20191215.fragments.SecondFragment
import com.yhkim.kt_fragment_20191215.fragments.ThirdFragment

class MainViewPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> {"사용자 정보"}
            1 -> {"두번째 화면"}
            else -> {"마지막"}
        }
    }

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
            1 -> { SecondFragment() }
            else -> { ThirdFragment() }
        }
    }

    override fun getCount(): Int {
        return 3
    }

}