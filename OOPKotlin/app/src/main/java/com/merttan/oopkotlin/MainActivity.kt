package com.merttan.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var myUser=User("Mert",1)
        myUser.name="Turan"
        myUser.age=12

        println("Age: ${myUser.age.toString()} \nName: ${myUser.name}")

        var myMusician =Musician("Ali","Guitar",22)

        
    }
}