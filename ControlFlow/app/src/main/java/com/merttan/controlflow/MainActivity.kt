package com.merttan.controlflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("------ Kontrol Akışları ------")
        var a=12
        var b=13

        var sayi1 = 12
        if(12<14 ) sayi1 = 14
        println(sayi1)

        println("-------------------------------")
        var sayi2:Int
        if(a>b){
            sayi2=a
        }
        else{
            sayi2=b
        }
        println(sayi2)

        println("-------------------------------")
        val sayi3 = if (a > b) a else b
        println(sayi3)

        println("-------------------------------")

        val sayi4 = if(a>b){
            print("A")
            a
        }else{
            println("B")
            b
        }

        println("-------------------------------")

        // when yapısı bakımından switch'e benzer. 149.sayfa
        val x=32
        when (x){
            1 -> println(" x==1")
            2 -> println(" x==2")
            12-> println(" x==12")
            else ->{ println("x ne 1 ne de 2 dir")}
        }
        println("-------------------------------")
        when (x){
            0,1->println("x==0 veya x==1")
            else -> println(" x, 0 veya 1 dışında bir sayıdır")
        }
        println("-------------------------------")

        val s=10
        when(x){
            parseInt(s.toString()) -> println("s encodes x")
            else -> println("s does not encodes x")
        }
        println("-------------------------------")

        when(x){
            in 1..10 -> println("x sayısı 1-10 aralığı içinde")
            !in 10..20 -> println("x sayısı 10-20 aralığında değil")
            else -> println("x sayısı 1-10 aralığı içinde değil veya x sayısı 10-20 aralığında olabilir")

        }

    }


        fun hasPrefix(pr :Any ) =when(pr){
            is String -> pr.startsWith("prefix")
            else -> false
        }


}