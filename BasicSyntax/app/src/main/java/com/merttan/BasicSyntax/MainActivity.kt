package com.merttan.BasicSyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Double.sum

class MainActivity : AppCompatActivity() {

    //sampleStart
    val PI = 3.14
    var vrbl = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello word")

        fun sum(a: Int, b: Int) = a + b
        fun multiplication(a: Int, b: Int) = a * b

        println("sum of 19 and 23 is ${sum(19, 23)}")
        println("multiplication of 3 and 4 is ${multiplication(3, 4)}")

        printSum(-1, 8)
        printmultiplication(5, 7)


        println("----------------Veriables--------------")
        val a : Int=1
        val b = 2
        val c : Int
        c=3
        println(" a =$a, b=$b, c=$c")

        var x = 11
        x += 1
        println(" x=$x")

        println("----------------Top-Level Veriables--------------")
        println("vrbl=$vrbl; PI=$PI")
        increment()
        println("incrementX()")
        println("vrbl=$vrbl; PI=$PI")


        println("----------------String Teamples--------------")

        var d = 1
        val s1 = "a is $a"
        d =2
        val s2 = "${s1.replace("is" , "vas")}, but now is $a"
        println(s2)


    }
    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }
    fun printmultiplication(a: Int, b: Int): Unit {
        println("multiplication of $a and $b is ${a * b}")
    }
    fun increment(){
        vrbl +=1
    }


}
