package com.merttan.genelcalisma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number1=12
        var number2=14
        var number3 = number1 + number2
        println(number3)
        println("-----------------------------")
        if(number1 in 10..15){
            println("$number1 sayısı 10-15 arasında")
        } else
            println("$number1 aralık dışında")
        println("-----------------------------")
        for (i in 0..10){
            println("$i\t")
        }
        println("-----------------------------")
        for (i in 0 until 13){
            println("$i\t")
        }
        println("-----------------------------")
        var dizi= listOf("12","qwe","werwer","12332")
        println("dizinin boyutu: $dizi.size")
        var index=0
        while(index < dizi.size){
            println(dizi[index])
            index++
        }
        //Listedeki bir eleman şartı sağlıoyrsa true döner
        val list=listOf(1,3,5,7,9)
        println(list.any { it>8 }) //true
        println(list.any { it>10 }) // false




       /*
        var array : IntArray = intArrayOf(1,2,3,4,5,6,7)
        for (i in array.indices){
            println(array[i])
        }

        var dizi2=listOf("Fatih","Sultan", "Mehmet","Vakıf","Üniversitesi")
        var index2=5
        while(dizi.size > 0){
            println(dizi2[index2])
            index2--
        }
*/
    }
}