package com.merttan.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Activity oluşturuldu..
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("on Create called")
    }
    // Activity oluşturuldu, başladı..
    override fun onStart() {
        super.onStart()
        println("on Start called")
    }
    // Activity oluşturuldu , başladı , devam ediyor..
    override fun onResume() {
        super.onResume()
        println("on Resume called")
    }
    // Activity oluşturuldu , başladı , devam ediyor, durdu...
    override fun onPause() {
        super.onPause()
        println("on Pause called")
    }
    // Activity yeniden başladı...
    override fun onRestart() {
        super.onRestart()
        println("on Restart called")
    }
    // Activity oluşturuldu , başladı , devam ediyor, durdu , bitii ...
    override fun onStop() {
        super.onStop()
        println("on Stop called")
    }
    // Activity oluşturuldu , başladı , devam ediyor, durdu , bitii ve son olarak yok edildi ...
    override fun onDestroy() {
        super.onDestroy()
        println("on Destroy called")
    }

    fun next(view : View){
        val intent =Intent(applicationContext, NextActivity::class.java)
        intent.putExtra("username", editText.text.toString())
        intent.putExtra("name", editText2.text.toString())
        startActivity(intent)
        finish()
    }
}