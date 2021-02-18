package com.merttan.landmarksbookapp

import android.graphics.Bitmap

class Singleton {
    //Singleton, tek bir insteance ve objesi olan sınıf demektir.

    companion object selected{ // companion object ile tüm sınıflardan buraya ulaşabiliyor
        //Java da bunun daha karışık bir yapısı vardır
        var selectedImage :Bitmap?= null




    }
}