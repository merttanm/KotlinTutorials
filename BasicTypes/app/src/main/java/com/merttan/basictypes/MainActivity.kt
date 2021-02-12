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

        println(printDouble(d))
    //  printDouble(i) //Error : Type missmatch
    //  printDouble(f) //Error : Type missmatch

    //---------------------------Underscores in numeric literals (since 1.1)-----------------------

        println("-----Alt çizgi kullanımı-----")
        val sixMillion = 1_000_000
        val creatingCartNumber=123_456_678_123L
        val socialSecurityNumber=234_000_000L
        val hexBytes = 0xFF_EC_DE_5E
        val bytes=0b11010010_01101001_10010100_10010010
        println("sixMillion           = $sixMillion")
        println("creatingCartNumber   = $creatingCartNumber")
        println("socialSecurityNumber = $socialSecurityNumber")
        println("hexBytes             = $hexBytes")
        println("bytes                = $bytes")

        val a : Int =100
        val boxedA : Int? =a
        val anotherBoxedA : Int? = a

        val b :Int = 128
        val boxedB :Int? =b
        val anotherBoxedB : Int? = b
        println(boxedA === anotherBoxedA) // true
        println(boxedB === anotherBoxedB) //false


        val c :Int =10000
        println(c==c)// true
        val boxedC: Int? =c
        val anotherBoxedC : Int? = c
        println(boxedC == anotherBoxedC) //true














    }
}