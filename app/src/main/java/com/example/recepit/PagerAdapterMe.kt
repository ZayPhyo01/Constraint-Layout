package com.example.recepit

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.PagerAdapter
import android.view.View

class PagerAdapterMe(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getItem(p0: Int): Fragment {
        var fg: Fragment? = InfoFragment()
        if (p0 == 0)
            fg = InfoFragment()
        return fg!!

    }

    override fun getCount(): Int{return 3}

    override fun getPageTitle(position: Int): CharSequence? {
        return if (position == 0) { "Info" }else
        { "info" }
    }


}