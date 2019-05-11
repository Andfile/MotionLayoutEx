package com.example.motionlayoutex

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.motionlayoutex.first_ex.FirstMotionExample
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        first_example_btn.setOnClickListener {
           startActivity(Intent(this, FirstMotionExample::class.java))
        }
    }

}
