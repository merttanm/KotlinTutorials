package com.merttan.sqlitekotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try {

            val myDatabase = this.openOrCreateDatabase("Musicians", Context.MODE_PRIVATE,null)   // Veri tabanı oluşturuyoruz

            myDatabase.execSQL("CREATE TABLE IF NOT EXISTS musicians (id INTEGER PRIMARY KEY,name VARCHAR, age INT)") // Tablo oluşturuyor

           // myDatabase.execSQL("INSERT INTO musicians (name, age) VALUES ('Mert',25)") // Tabloya veri ekliyor
            //myDatabase.execSQL("INSERT INTO musicians (name, age) VALUES ('Veli',23)") // Tabloya veri ekliyor
           // myDatabase.execSQL("INSERT INTO musicians (name, age) VALUES ('Van persie',31)") // Tabloya veri ekliyor

            //myDatabase.execSQL("UPDATE musicians SET age = 61 WHERE name = 'Veli'")  // veliye ait kaydın yaşını değiştiriyot
            //myDatabase.execSQL("UPDATE musicians SET name = 'Kirk Hammett' WHERE id = 3") // ıd=3 olan kaydın adını değiştiriyor

            myDatabase.execSQL("DELETE FROM musicians WHERE name = 'Veli'") // veliye ait kaydı siliyor


            //val cursor = myDatabase.rawQuery("SELECT * FROM musicians WHERE id = 3",null)

            //val cursor = myDatabase.rawQuery("SELECT * FROM musicians WHERE name LIKE 'K%'",null)

            val cursor = myDatabase.rawQuery("SELECT * FROM musicians",null)  // Tablo içerisindeki her veriyi çekiyoruz

            val nameIx = cursor.getColumnIndex("name")
            val ageIx = cursor.getColumnIndex("age")
            val idIx = cursor.getColumnIndex("id")

            while (cursor.moveToNext()) {
                // indexleri gezecek
                println("Name: " + cursor.getString(nameIx))
                println("Age: " + cursor.getInt(ageIx))
                println("Id: " + cursor.getInt(idIx))
            }

            cursor.close()


        } catch (e: Exception) {
            e.printStackTrace()
        }

    }
}