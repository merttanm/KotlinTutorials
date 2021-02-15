package com.merttan.viewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.merttan.viewbindingkotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    // private lateinit var textView :textView
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }


    // butona onClick metodu oluşturuyordum
    fun ismiDegistir(view : View){
        println("Değiştiriliyor.... Değiştirilmekte olan...")
        // build.gradle da id 'kotlin-android-extensions' eklemeyi unutma
        //textView.text="Değiştiriliyor.... Değiştirilmekte olan..."
        // View binding yöntemi

        binding.textView.text = "Merhaba Baba"



    }
}