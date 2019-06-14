package com.example.recepit

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.PagerAdapter
import android.view.View

class PagerAdapterMe(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getItem(p0: Int): Fragment {
        val fg: Fragment
        if (p0 == 0)
            fg = InfoFragment()
        else
            if (p0 == 1) {
                fg = MaterailFragment()
            }
        else {
                fg = VideoFragment()
            }
        return fg

    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        val title : String
        if (position == 0) {
            title = "info"
        } else
            if (position == 1) {
                title = "Materail & Doing"
            } else
                title = "Video"
        return title
    }


}