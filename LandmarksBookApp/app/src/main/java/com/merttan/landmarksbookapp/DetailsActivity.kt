package com.merttan.landmarksbookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.graphics.BitmapFactory
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val intent = intent
        val  landmaksname = intent.getStringExtra("name")
        city.text=landmaksname

        // Image efektif çözümü
        val landmarksImageId= intent.getIntExtra("image",0)

        val selectedBitmap = BitmapFactory.decodeResource(applicationContext.resources, landmarksImageId)
        imageView.setImageBitmap(selectedBitmap)

        /*
        val singleton=Singleton.selected
        val selectedBitmap=singleton.selectedImage
        imageView.setImageBitmap(selectedBitmap)
*/


    }
}