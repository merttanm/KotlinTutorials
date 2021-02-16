package com.merttan.kotlincountdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // CountDownTimer objeye atıyoruz
        object : CountDownTimer(1000000,100){
            // sayaç başlangıcı ve değişimi
            override fun onTick(millisUntilFinished: Long) {
                txt.text="Left: ${millisUntilFinished/1000}"
            }
            // sayacın bitimi
            override fun onFinish() {
                txt.text="left: 0"
            }

        }.start()

    }
}