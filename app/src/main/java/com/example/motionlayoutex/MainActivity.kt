package com.example.motionlayoutex

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.motionlayoutex.first_ex.FirstMotionExample
import com.example.motionlayoutex.second_ex.SecondExCustomAttrsActivity
import com.example.motionlayoutex.third_ex.ThirdExImageActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        first_example_btn.setOnClickListener { startActivity(Intent(this, FirstMotionExample::class.java)) }
        second_example_btn.setOnClickListener { startActivity(Intent(this, SecondExCustomAttrsActivity::class.java)) }
        third.setOnClickListener { startActivity(Intent(this, ThirdExImageActivity::class.java)) }
    }
}
