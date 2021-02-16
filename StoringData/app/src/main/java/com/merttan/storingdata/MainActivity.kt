package com.merttan.storingdata

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.edit
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
     lateinit var sharedPreferences : SharedPreferences
      var getSharedPreferences :Int? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // SharedPreferences
         sharedPreferences=this.getSharedPreferences("com.merttan.storingdata", MODE_PRIVATE)
         getSharedPreferences= sharedPreferences.getInt("age",-1)
        if(getSharedPreferences==-1){
            println("Hata")
        } else{
            //Emülator yeniden açılınca son kaydedilen anahtar kelimeyi Text e basar
           textView.text="Your age: $getSharedPreferences"
        }
    }

    fun save(view : View){


        var text= editText.text.toString().toIntOrNull()

        if(text!=null) {
            textView.text = "Age :$text"
            println("--------Veri Kaydedildi--------")
            sharedPreferences.edit().putInt("age", text).apply() // Veriyi kaydeder

        }
    }
    fun delete(view :View){

        getSharedPreferences= sharedPreferences.getInt("age",-1)
        if(getSharedPreferences != -1 ){
            sharedPreferences.edit().remove("age")
            println("--------Veri Silindi--------")
            textView.text="Artık yaşı boş geçer.."
        }

    }

}