package com.josiassena.cicularprogressview

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Add a simple loading animation to make it look nice
        var count = 1
        val handler = Handler()

        val runnable = object : Runnable {
            override fun run() {
                if (count <= 100) {
                    handler.postDelayed(this, 10)

                    circularView.setPercentage(count)

                    count++
                }
            }
        }

        handler.post(runnable)
    }
}
