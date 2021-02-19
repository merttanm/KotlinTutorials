package com.merttan.mathoperations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// Matematik işlemleri
class MainActivity : AppCompatActivity() {
    /*
     Uzun süredir devam eden talebi karşılayan
     Kotlin 1.2 sürümü ile JMS ve JS için ortak
     olan matematik işlemlerini için Kotlin.math
     API'si ekler*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(arcTan(2.3,3.5))
        println(TAU)


    }
}