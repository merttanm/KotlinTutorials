package com.merttan.artbookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // biraz once oluşturduğum menüyü buraya bağlıyoruz
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater=menuInflater
        menuInflater.inflate(R.menu.add_art,menu)
        return  super.onCreateOptionsMenu(menu)

    }

    // seçilen itemin ne olduğunu anlayıp ona göre iş yapturuyoruz
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId== R.id.add_art_item){
            val intent= Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }
        return super.onOptionsItemSelected(item)
    }



}