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

