package com.merttan.alertdialogkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Java gösterimi
        //Toast.makeText(MainActivity.this, "Selam", Toast.LENGTH_LONG).show()
        //Kotlin gösterimi
        Toast.makeText(this@MainActivity, "Selam", Toast.LENGTH_LONG).show()

    }

    fun save(view : View){
        val alert =AlertDialog.Builder(this)
        alert.setTitle("Save")
        alert.setTitle("Are You Sure?")
        // onClick Listener
        alert.setPositiveButton("Yes"){ dialog ,which -> Toast.makeText(applicationContext,"Saved", Toast.LENGTH_LONG).show()}
        // onClick Listener
        alert.setNegativeButton("No"){ dialog ,which -> Toast.makeText(applicationContext,"Not Saved", Toast.LENGTH_LONG).show()}

        alert.show()
    }
}