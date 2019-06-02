package com.example.motionlayoutex.third_ex

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.motionlayoutex.R
import com.example.motionlayoutex.utils.UtilsFragment

class ThirdExActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_ex)
        //setContentView(R.layout.image_filter_layout)
        replaceFragment()
    }

    private fun replaceFragment() {
        UtilsFragment.replaceFragment(
            supportFragmentManager,
            ImageExMotionFragment.newInstance(),
            R.id.fragment_container,
            false
        )
    }

}
