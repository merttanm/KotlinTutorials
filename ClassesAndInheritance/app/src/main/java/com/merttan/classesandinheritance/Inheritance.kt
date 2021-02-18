package com.merttan.classesandinheritance

fun main(args:Array<String>){
    var prs :PersoneKontrol=Personel ()
    prs.mudur()
    prs.yazilimci()
    prs.ik()
    prs.about()

}


interface PersoneKontrol{
    fun mudur()
    fun yazilimci()
    fun ik()
    open fun about(){}

}

class Personel : PersoneKontrol{

    override fun mudur(){
        println("Müdür")
    }

    override fun yazilimci(){
        println("Yazilimci")
    }

    override fun ik(){
        println("Ik")
    }
    override fun about(){
        super.about()
        println("---")

    }

}