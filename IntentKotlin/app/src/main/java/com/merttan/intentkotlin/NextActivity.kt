package com.merttan.intentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val intent = intent
        val username= intent.getStringExtra("username")
        val name    = intent.getStringExtra("name")
        // Toast ile ekrana mesaj göstermek
        Toast.makeText(this, "Serengetiye Hoşgeldin", Toast.LENGTH_LONG).show()
        textView.text="Username: $username Name: $name"
    }
}