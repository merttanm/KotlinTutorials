package com.merttan.artbookapp

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import java.util.jar.Manifest

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }


    fun selectImage(view : View){
/*
Kullanıcıdan uygulama çalışırken galerisini kullanmak için izin isteriz
bu işlemi AndroidMnifest dosyasında yaparız. Eğer ki kullanıcıdan izin
aldıysak ve kullanıcı daha önceden bu izni onayladıysa bunu her seferinde
istemeyiz. Android 23 sürümü öncesi bu izin işlemleri gerekmiyordu*/

        if(ContextCompat.checkSelfPermission(this, android.Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED)


    }
}