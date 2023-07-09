package com.biiapps.unitconverter.util


fun Int.metSecondToKmh(i: Double): Double {
    var r =3.6*i
    return r
}

fun Int.milesHourToKmh(i: Double): Double {
    var r = i*1609344/1000000

    return r
}

fun Int.milesSecondToKmh(i: Double): Double {
    var r = i*57936384/10000

    return r
}

fun Int.feetHourToKmh(i: Double): Double {
    var r = i*3/10000

    return r
}

fun Int.feetMinToKmh(i: Double): Double {
    var r = i*18288/1000000

    return r
}

fun Int.feetSecondToKmh(i: Double): Double {
    var r = i*109728/100000

    return r
}
//Todo:
fun Int.kmhToMetSecond(i: Double): Double {
    var r =i/3.6
    return r
}

fun Int.kmhToMilesHour(i: Double): Double {
    var r = i*1000000/1609344

    return r
}

fun Int.kmhToMilesSecond(i: Double): Double {
    var r = i*10000/57936384

    return r
}

fun Int.kmhToFeetHour(i: Double): Double {
    var r = i*10000/3

    return r
}

fun Int.kmhToFeetMin(i: Double): Double {
    var r = i*1000000/18288

    return r
}

fun Int.kmhToFeetSecond(i: Double): Double {
    var r = i*100000/109728
    return r
}
