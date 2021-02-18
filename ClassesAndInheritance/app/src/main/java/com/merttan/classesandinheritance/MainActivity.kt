package com.merttan.classesandinheritance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        InitOrderDemo("hello")
        Constructors(1456466)
        var prs :PersoneKontrol=Personel ()
        prs.mudur()
        prs.yazilimci()
        prs.ik()
        prs.about()
    }
}