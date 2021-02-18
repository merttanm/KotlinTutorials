package com.merttan.classesandinheritance
// Sınıf tanımlaması
class InitOrderDemo(name :String)
    { // gövdesi

    val firstProperty ="First property: $name".also(::println)
    /*
    init bloğu: bir sınıftan nesne oluşturulduğunda tetiklenir ve içindeki kod bloğunu çalıştırır.
    Bir sınıftan bir nesne oluşturulduğu anda ilk önce constructor daha sonra init bloğu çalıştırılır
    */
    init {
        println("First initializer block thar prints: ${name}")
    }

     val secondProperty ="Second property: $name".also(::println)

    init {
        println("Second initializer block that prints: ${name}")
    }



}


