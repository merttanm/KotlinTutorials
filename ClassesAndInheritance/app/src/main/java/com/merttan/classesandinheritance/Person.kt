package com.merttan.classesandinheritance


// Secondary constructors örneği
class Person {
    var children :MutableList<Person> = mutableListOf()
    //ikincil anahtarı bildiriyorum
    constructor(parent: Person){
        parent.children.add(this)
    }
    /*
    Eğerki sınıfta iki tane yapıcı anahtar varsa ikincisi birinciye yetkği vermesi lazımdır

    class Person(val name: String) {
        var children: MutableList<Person> = mutableListOf()
        constructor(name: String, parent: Person) : this(name) {
        parent.children.add(this)
            }
        }
    */

}