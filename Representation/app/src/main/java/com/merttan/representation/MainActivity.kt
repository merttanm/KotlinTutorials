package com.merttan.representation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a: Int = 100
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        val b: Int = 10000
        val boxedB: Int? = b
        val anotherBoxedB: Int? = b
        println(boxedA === anotherBoxedA) // true
        println(boxedB === anotherBoxedB) // false

        val x = 5 / 2
        //println(x == 2.5) // ERROR
        println(x == 2)
        val y = 5L / 2
        println(y == 2L)

        val z = 5 / 2.toDouble()
        println(z == 2.5)



    }

        fun decimalDigitValue (c : Char) : Int {
            if(c !in '0'..'9')

                throw IllegalAccessException("Aralık dışında")
            return c.toInt() - '0'.toInt()
        }




}