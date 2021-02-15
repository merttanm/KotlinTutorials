package com.merttan.simpsonexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var name =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

  fun simpsonDataAdd(view : View){
      name = nameText.text.toString()
      val job = jobText.text.toString()
      var age = ageText.text.toString().toIntOrNull() // Convert string number to Int
      if(age==null){
          age=0
      }

      //val simpson=Simpson(name,age,job)
      resultText.text="Name : ${name}  Job : ${job}  Age : ${age}"

  }

    fun scopeExample(view: View){
        println(name)
    }

}