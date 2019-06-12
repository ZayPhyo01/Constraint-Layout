package com.example.recepit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pagerAdapterMe = PagerAdapterMe(supportFragmentManager)
        vP.adapter = pagerAdapterMe
        tBLay.setupWithViewPager(vP)
    }
}
