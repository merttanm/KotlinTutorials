package com.merttan.mathoperations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// Matematik işlemleri
class MainActivity : AppCompatActivity() {
    /*
     Uzun süredir devam eden talebi karşılayan
     Kotlin 1.2 sürümü ile JMS ve JS için ortak
     olan matematik işlemlerini için Kotlin.math
     API'si ekler*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(arcTan(2.3,3.5))
        println("TAU:  $TAU")
        println("PI:   $PI")
        println("PI/2: $PI_ON_2 ")
        println("PI/3: $PI_ON_3 ")
        println("PI/4: $PI_ON_4 ")
        println("PI/6: $PI_ON_6 ")
        println("e:    $E")
        println("sqr2: $ROOT2")
        println("sqr3: $ROOT3")
        println("sin45:$ROOT2")
        println("cos30:$ROOT3")
        println("cos45:$ROOT2")
        println("sin60:$ROOT3")
        println("60                 derece:${toRadians(60.0)} radyan ")
        println("1.0471975511965976 radyan:${toDegrees(1.0471975511965976)} derece")
        println("sin(1.2):     ${sin(1.2)}")
        println("arcSin(0.2):  ${arcSin(0.2)}")
        println("cos((1.2):    ${cos(1.2)}")
        println("arcCos(0.2):  ${arcCOS(0.2)}")
        println("tan(1.2):     ${tan(1.2)}")

    }
}