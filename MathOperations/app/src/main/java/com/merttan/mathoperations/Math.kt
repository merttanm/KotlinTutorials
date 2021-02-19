package com.merttan.mathoperations
import kotlin.math.PI
import kotlin.math.acos
import kotlin.math.asin
import kotlin.math.atan

    //  CONSTANTS
    const val TAU = 2* Math.PI // 360 derece
    const val PI = Math.PI     // 180 derece
    const val PI_ON_2 = PI/2   // 90 derece
    const val PI_ON_3 = PI/3   // 60 derece
    const val PI_ON_4 = PI/4   // 45 derece
    const val PI_ON_6 = PI/6   // 30 derece
    const val E =  Math.E      //  e = 2,7182818284590452353
    const val ROOT2 = 1.41421356237 // Kök2
    const val ROOT3 = 1.73205080757 // kök3
    const val SİN45 = ROOT2 /2 //  sin45 ve cos45 derece
    const val COS45 = SİN45    //  cos45
    const val COS30 = ROOT3 /2 //  cos30 ve sin60 derece
    const val SİN60 = COS30    //  sin 60

    //  TRİGONOMETRİ

    fun sin(radians:Double)=kotlin.math.sin(radians)
    fun arcSin(sin :Double)=asin(sin)
    fun cos(radians:Double)=kotlin.math.cos(radians)
    fun arcCOS(cos :Double)=acos(cos)
    fun tan(radians:Double)=kotlin.math.tan(radians)

    fun arcTan(oppositeY: Double, adjacentX: Double): Double {
        var tan = atan(oppositeY / adjacentX)

        if (adjacentX < 0)
            tan += PI
        else if (oppositeY < 0)
            tan += TAU

        return tan
    }
    fun toRadians(degrees: Double) = degrees / 180.0 * PI

    fun toDegrees(radians: Double) = radians * 180.0 / PI










