package com.merttan.classesandinheritance

class Constructors {
    init{
        println("Init blok")
    }
    constructor(i :Int){
        println("Constructor")
    }

}

open class Base ( p: Int)

class Derived ( p: Int) : Base(p)