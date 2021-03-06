package com.merttan.genelcalisma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var myList = arrayOf(1,2,3,4)


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
        println(list.any { it>8 }) // en az bir eleman sağlıyorsa -- true
        println(list.any { it>10 }) //en az bir eleman sağlıyorsa -- false
        println(list.all { it> 10 })  // tüm elemanlar koşulu sağlıyorsa
        println(list.all { it> 0 })  // tüm elemanlar koşulu sağlıyorsa
        println(list.count { it>4 }) // koşuldan büyük veya küçük elemanların toplam sayısı döner
        println(list.count { it>9 }) // koşuldan büyük veya küçük elemanların toplam sayısı döner
        list.forEach{ println(it)} // for
        list.forEachIndexed { index, i -> println("$index. sayısı $i") } // index value for
        println(list.max()) // max value
        println(list.min())  // min value
        println(list.drop(0)) // 0 dan büyük rakamları listeler
        println(list.filter { it <4 }) // koşula göre listeler
         var array = arrayOf(1453,223,300,400,500,600,"asdasdadada")
         println(array.size)


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
  println("---------------------------------------------------------")
        var myList = listOf(1,23,4,5,6)
        println(myList.get(2))
        println(myList.indexOf(1))
        println(myList.max())
        println(myList.min())
        println("---------------------------------------------------------")
        for (item in myList){
            println(item)
        }

        var myArray = arrayOf("Fatih","Sultan","Mehmet","Vakıf", "Universitesi")

        for (element in myArray){
            text_view.text = text_view.text.toString() + element + ", "
        }

        Toast.makeText(this@MainActivity ,"Serengetiye Hoşgeldinn", Toast.LENGTH_LONG).show()



        val rows = 10
        val rows2= 0

        for (i in 1..rows){
            for (j in 1..i){
                print("*")
            }
            println()
        }

        for (k in rows downTo 1){
            for (l in 1..k){
                print("*")
            }
            println()
        }

        Toast.makeText(this@MainActivity, "selam", Toast.LENGTH_LONG).show()



    }



}