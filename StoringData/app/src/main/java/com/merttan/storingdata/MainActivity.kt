package com.merttan.storingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun save(view : View){

        // SharedPreferences
        var text= editText.text.toString().toIntOrNull()

        if(text!=null) {
            textView.text = "Age :$text"
        }
    }
    fun delete(view :View){

    }

}