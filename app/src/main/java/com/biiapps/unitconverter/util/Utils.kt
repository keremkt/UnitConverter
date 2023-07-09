package com.biiapps.unitconverter.util


fun Int.metSecondToKmh(i: Double): Double {
    return 3.6 * i
}

fun Int.milesHourToKmh(i: Double): Double {

    return i * 1609344 / 1000000
}

fun Int.milesSecondToKmh(i: Double): Double {

    return i * 57936384 / 10000
}

fun Int.feetHourToKmh(i: Double): Double {

    return i * 3 / 10000
}

fun Int.feetMinToKmh(i: Double): Double {

    return i * 18288 / 1000000
}

fun Int.feetSecondToKmh(i: Double): Double {

    return i * 109728 / 100000
}

//Todo:
fun Int.kmhToMetSecond(i: Double): Double {
    return i / 3.6
}

fun Int.kmhToMilesHour(i: Double): Double {

    return i * 1000000 / 1609344
}

fun Int.kmhToMilesSecond(i: Double): Double {
    val r = i*10000/57936384

    return r
}

fun Int.kmhToFeetHour(i: Double): Double {

    return i * 10000 / 3
}

fun Int.kmhToFeetMin(i: Double): Double {

    return i * 1000000 / 18288
}

fun Int.kmhToFeetSecond(i: Double): Double {
    return i * 100000 / 109728
}
