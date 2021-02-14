package com.merttan.collections

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("-------------------Araylist-------------------")
        val arrayList = arrayOf(1,2,3,4,5,6)
        println(arrayList)

        val myMsician= arrayListOf<String>("Tarkan","Tevetoğlu")
        myMsician.add("Güllü")
        myMsician.add(3,"Kadırgalı")
        myMsician.add(4,"Aysel")
        println(myMsician)

        println("-------------------Map-------------------")



        val ListFruit = listOf("Ali", "Mehmet", "Fikret", "Amk")

        for (item in ListFruit) {
            println(ListFruit)
        }
        when {
            "Mehmet" in ListFruit -> println("Mehmet listede kayıtlı ")

        }
        ListFruit
                .filter { it.startsWith("A") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { println(it) }


        val music = listOf ("bizimkisi","bir"," aşk"," hikayesi")
        println("dizideki eleman sayısı: ${music.size}")
        println(music)

    }




}
