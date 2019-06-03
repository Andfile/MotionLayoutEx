package com.example.motionlayoutex.second_ex

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.motionlayoutex.R
import com.example.motionlayoutex.utils.UtilsFragment

class SecondExCustomAttrsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_ex)
        replaceFragment()
    }

    private fun replaceFragment() {
        UtilsFragment.replaceFragment(
            supportFragmentManager,
            SecondExWithSelfConstraintSets.newInstance(),
            R.id.fragment_container,
            false
        )
    }

}
