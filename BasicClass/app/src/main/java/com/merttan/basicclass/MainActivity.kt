package com.merttan.basicclass

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.drawable.shapes.Shape
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.solver.widgets.Rectangle
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val d1 = LuckDispatcher()
        val d2 = LuckDispatcher()

        d1.getNumber()
        d2.getNumber()
        //-----------------Read-only list----------------
        val list = listOf("a", "b", "c")
        //-----------------Read-only map----------------
        val map = mapOf("a" to 1, "b" to 2, "c" to 3)

        println(list)
        println(map)
        println(map["a"])

        val myObject = object : MyAbstractClass() {
            override fun doSomething() {
// ...
            }
            override fun sleep() { // ...
            }
        }
        myObject.doSomething()
/*
        val files = File("Test").listFiles()
        println(files?.size)
*/
        //-----------------Swapping two variables----------------
        var a = 1
        var b = 20
        a = b.also { b = a }
        println(a)

        val homer=Simpson(54,"HomerSimpson","Nuclear")
        println("${homer.age} ${homer.name} ${homer.job}")
        //Object & Instance
        //homer.name="Homer"
       // homer.job="Nuclear"
       // homer.age=50
       // println("Name   : ${homer.name}")
       // println("Job    : ${homer.job}")
      //  println("Age    : ${homer.age}")
        println("---------------Nullable(?) && Non-null------------------")
        //Nullability
        //Nullable(?) && Non-null
        /*Değişken tanımlarken türünü bilmiyorsak null olarak tanımlayabiliriz ve güvenli kod yazmak için onemlidir*/
        var myString :String?= null
        var myAge :Int?=null
        //null olarak tanımladığımız nesneleri, aritmalik işlemlerle doğrudan çarpamayız.Örneğin null *10 HATA verir
        println(myString)
        // !!  KESİN VAR DEMEK
        // ?   VAR MI YOK MU BELLİ DEĞİL DEMEK
        println("---------------Nullable(?) && Non-null ile Güvenlik kontorlleri------------------")
        // 1) Null safely (Null güvenliği kontrolü)
        if(myAge != null){
            println(myAge *10)
        }else{
            println("myAge is null")
        }
        // 2) Safe call
        println(myAge?.toString(2))
        // var mı yok mu bilinmiyor der

        // 3) elvis
        /* null değere  ?:  operatorü ile o an değer atıyoruz*/
        val myResult = myAge?.compareTo(2) ?: -123123
        println(myResult)

         }

        abstract class MyAbstractClass {
            abstract fun doSomething()
            abstract fun sleep()
        }

        object Resource {
            val name = "Name"
        }
        }

        class LuckDispatcher {
            fun getNumber() {
                var objRandom = Random()
                println(objRandom.nextInt(10))
            }
        }
