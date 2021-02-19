package com.merttan.sqlitekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            val myDatabase =this.openOrCreateDatabase("Muzisyenler", MODE_PRIVATE, null)  // Veri tabanı oluşturuyoruz
            myDatabase.execSQL("CREATE TABLE IF NOT EXISTS Muzisyenler (isim VARCHAR, yas INT)")    // Tablo oluşturuyor
            myDatabase.execSQL("INSERT INTO Muzisyenler (isim, yas) VALUES ('mert',25)")            // Tabloya veri ekliyor

            var cursor = myDatabase.rawQuery("SELECT * FROM Muzisyenler", null)        // Tablo içerisindeki her veriyi çekiyoruz
            var nameIndex = cursor.getColumnIndex("isim")
            var ageIndex = cursor.getColumnIndex("yas")

            while(cursor.moveToNext()){
                // indexleri gezecek
                println("Name: " +cursor.getString(nameIndex))

                println("Age: " +cursor.getString(ageIndex))

            }
            cursor.close()

        }catch (e :Exception){
            e.printStackTrace()
        }

    }
}