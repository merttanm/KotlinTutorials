package com.merttan.landmarksbookapp

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

var selectedGlobalBitmap : Bitmap? =null

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //List view oluşturuyoruz ve içine eleman ekliyoruz
        var landMarksName =ArrayList<String>()
        landMarksName.add("Ayasofya")
        landMarksName.add("Anıtkabir")
        landMarksName.add("Galata Tower")
        landMarksName.add("Eiffel")
        landMarksName.add("London Bridge")
/*
        //Image
        val ayasofya =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ayasofya)
        val anıtkabir =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.anitkabir)
        val galata =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.galata)
        val eiffel =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.eiffel)
        val london =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.london)

        var landmarksImages=ArrayList<Bitmap>()
        landmarksImages.add(ayasofya)
        landmarksImages.add(anıtkabir)
        landmarksImages.add(galata)
        landmarksImages.add(eiffel)
        landmarksImages.add(london)
*/
        // Image efektif çözümü

        val ayasofyaId =R.drawable.ayasofya
        val anıtkabirId =R.drawable.anitkabir
        val galataId =R.drawable.galata
        val eiffelId =R.drawable.eiffel
        val londonId =R.drawable.london

        var landmarksImageIds =ArrayList<Int>()
        landmarksImageIds.add(ayasofyaId)
        landmarksImageIds.add(anıtkabirId)
        landmarksImageIds.add(galataId)
        landmarksImageIds.add(eiffelId)
        landmarksImageIds.add(londonId)





        // Adapter oluşturuyorum
        val adapter = ArrayAdapter(this, R.layout.list_row ,R.id.textView2, landMarksName)

        listView.adapter =adapter
        listView.onItemClickListener= AdapterView.OnItemClickListener{parent, view, position, id ->

        val intent=Intent(applicationContext,DetailsActivity::class.java)

        // Arraylist den sıralanan  veriyi yolluyoruz
        // seçine itemi pozisyonunu veriyor ve name ye atıyor
            intent.putExtra("name",landMarksName[position])
            intent.putExtra("image",landmarksImageIds[position])
   /*
           var singleton = Singleton.selected
         singleton.selectedImage=landmarksImages[position]
   */
        startActivity(intent)

        }



    }
}