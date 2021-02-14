package com.merttan.idioms

import android.icu.util.RangeValueIterator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = listOf(1,2,4,5,6,7,8,9)
        println(list)

        val map = mapOf("a" to 1, "b" to 2, "c" to 3)
        println(map["a"])
        println(map["b"])
        println(map["c"])




        for( i in 1..100){}
        for( i in 1 until 100){}
        for( x in 2..10 step 2){}
        for( x in 10 downTo 1) {}


        println(theAnswer())






    }
    
    fun theAnswer()=42

}