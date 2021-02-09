package com.merttan.loopslearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        forLoop()
        whileLoop()
        println(describe(1))
        println(describe("Hello"))
        println(describe(1000L))
        println(describe(2))
        println(describe("other"))


        val list = listOf("a","b","c")
        if (2 in 0..list.lastIndex) {
            println( "2 is out of range")
        }


        var x = 8
        if (x in 1..10) { // => x>=1 && x<=10
            println("x>=1 && x<=10")
        }

        val items = listOf("Fatih", "Sultan", "Mehmet")

        for (item in items) {
            println(item)
        }

        val items2 = setOf("apple", "banana", "kiwifruit")

        when {
            "apple" in items2 -> println("apple is fine too")
        }


    }

}

        fun forLoop(){
            val itemsf =listOf("Apple", "Banana", "Kiwi", "Orange", "Watermelon")
            for(item in itemsf){
                println(itemsf)
            }}


        fun whileLoop(){
            val items =listOf("Ali", "Veli", "Mehmet", "Numan", "Berkilop")
            var index=0
            while(index<items.size){
                println("item at $index is ${items[index]}")
                index++
                //sampleEnd
            }

        }
        fun describe(obj: Any): String =
                when (obj) {
                    1 -> "One"
                    "Hello" -> "Greeting"
                    is Long -> "Long"
                    !is String -> "Not a string"
                    else -> "Unknown"
                }



