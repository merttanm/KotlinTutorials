package com.merttan.returnandjumps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("-------------Break and Countinue labeller------------------")
        loop@ for(i in 1..100){
            println(i)
        }

        println("-------------Return labeller------------------")
        foo()
        println("--------------anonymous function-----------------")
        foo2()
        foo3()
        println("--------------Toast, emülator ekranına mesaj yazdırma işlemini görüyor-----------------")
        niceToast("SELAMLAR")
        niceToast("MESAJIMI ALDINIZ MI")
        niceToast("SAYGILARIMLA")


    }

    fun niceToast(message :String, tag :String=MainActivity::class.java.simpleName,length :Int =Toast.LENGTH_SHORT){
        Toast.makeText(this, "[$tag] $message", length).show()
    }




    fun foo(){
        listOf(1,2,3,4,5).forEach{
            if(it ==4) return
            // döngüde 4'e kadar dönecek 4' e eşit olduğu an dongüden atacak
            println(it)
        }
        println("bu noktaya ulaşılamadı")
    }

    fun foo2(){
        listOf(1,2,3,4,5).forEach(fun(value :Int){
            if(value==3) return
            println(value)
        })
        println("anonymous function")
    }

    fun foo3(){
        run loop@{
            listOf(1,2,3,4,5).forEach{
                //Doğrudan break kullanmıyor iç içe geçen lambda ekleyerek,
                // yerel olmayan bir şekilde dönerek simüle ediyor.
                if(it==4) return@loop
                println(it)
            }
        }
        println("done with nested loop")
    }
}