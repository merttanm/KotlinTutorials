package com.merttan.basictypes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        Byte    ----->  8 bits
        Short   ----->  16 bits
        Int     ----->  32 bits
        Long    ----->  64 bits
        */
        val one = 1 //Int
        val sixBillion = 6000000 // Long
        val oneLong = 1L //Long
        val oneByte : Byte = 1

        println("$one , $sixBillion  , $oneLong , $oneByte" )

        val pi = 3.14
        val e = 2.7182818284
        val eFloat = 2.7182818284f

        println("$pi , $e  , $eFloat " )

        fun printDouble ( d: Double ) { print(d)}
        val i=1
        val d=1.1
        val f=1.1f

        printDouble(d)
    //  printDouble(i) //Error : Type missmatch
    //  printDouble(f) //Error : Type missmatch






    }
}