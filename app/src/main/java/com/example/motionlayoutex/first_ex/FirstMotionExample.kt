package com.example.motionlayoutex.first_ex

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.motionlayoutex.R
import com.example.motionlayoutex.utils.UtilsFragment

class FirstMotionExample : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_motion_example)
        replaceFragment()
    }

    private fun replaceFragment() {
        UtilsFragment.replaceFragment(
            supportFragmentManager,
            ExampleWithMotionLayout.newInstance(),
            R.id.fragment_container,
            false
        )
    }

}
