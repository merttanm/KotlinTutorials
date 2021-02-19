package com.merttan.mathoperations
import kotlin.math.PI
import kotlin.math.atan

    //  CONSTANTS
    const val TAU = 2* Math.PI // 360 derece
    const val PI = Math.PI     // 180 derece
    const val PI_ON_2 = PI/2   // 90 derece
    const val PI_ON_3 = PI/3   // 60 derece
    const val PI_ON_4 = PI/4   // 45 derece
    const val PI_ON_6 = PI/6   // 30 derece
    const val E =  Math.E      //  e = 2,7182818284590452353


fun arcTan(oppositeY: Double, adjacentX: Double): Double {
    var tan = atan(oppositeY / adjacentX)

    if (adjacentX < 0)
        tan += PI
    else if (oppositeY < 0)
        tan += TAU

    return tan
}










