package com.biiapps.unitconverter.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.Locale

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    var curChoice = 0
    val text: LiveData<String> = _text

    var a = "011221"
    var currMenu = ""

    val menuSpeed = arrayOf(
        "Km/h",
        "Meter/s",
        "Miles/h",
        "Miles/m",
        "Miles/s",
        "Feet/h",
        "Feet/m",
        "Feet/s"
    )
    val menuLength = arrayOf(
        "Km",
        "Meter",
        "Miles",
        "Feet",
        "Inch",
        "Yard",
        "Nautical Mile"
    )
    val menuWeight = arrayOf(
        "Kg",
        "Gram",
        "Pound",
        "Ounce",
        "Stone",
        "Ton"
    )
    val menuTemperature = arrayOf(
        "c",
        "f",
        "k"
    )

    fun showResult(input: String, type: String, from: String, to: String): String {
        var result = ""
        if (input.isNotEmpty()) {
            Log.e("****^^****", "input: $input, type: $type, from: $from, to: $to")
            if (type.lowercase(Locale.ROOT) == "speed") {
                Log.e("geldi**", "geldi111 $to")
                if (from.lowercase(Locale.ROOT) == "km/h") {
                    if (to.lowercase(Locale.ROOT) == "km/h") {

                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "meter/s") {
                        result = (input.toDouble() / 3.6).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/h") {
                        result = (input.toDouble() / 1.609).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/m") {
                        result = (input.toDouble() / 26.822).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/s") {
                        result = (input.toDouble() / 5793.638).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/h") {
                        result = (input.toDouble() * 3280.84).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/m") {
                        result = (input.toDouble() * 54.68).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/s") {
                        Log.e("geldi**", "geldi222")
                        result = (input.toDouble() * 0.911).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "meter/s") {
                    if (to.lowercase(Locale.ROOT) == "km/h") {
                        result = (input.toDouble() * 3.6).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "meter/s") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/h") {
                        result = (input.toDouble() * 2.237).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/m") {
                        result = (input.toDouble() * 0.037).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/s") {
                        result = (input.toDouble() * 0.0006).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/h") {
                        result = (input.toDouble() * 11811.024).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/m") {
                        result = (input.toDouble() * 196.85).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/s") {
                        result = (input.toDouble() * 3.281).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "miles/h") {
                    if (to.lowercase(Locale.ROOT) == "km/h") {
                        result = (input.toDouble() * 1.609).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "meter/s") {
                        result = (input.toDouble() * 0.447).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/h") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/m") {
                        result = (input.toDouble() * 0.017).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/s") {
                        result = (input.toDouble() * 0.0003).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/h") {
                        result = (input.toDouble() * 5280).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/m") {
                        result = (input.toDouble() * 88).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/s") {
                        result = (input.toDouble() * 1.467).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "miles/m") {
                    if (to.lowercase(Locale.ROOT) == "km/h") {
                        result = (input.toDouble() * 26.822).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "meter/s") {
                        result = (input.toDouble() * 0.037).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/h") {
                        result = (input.toDouble() * 60).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/m") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/s") {
                        result = (input.toDouble() * 0.017).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/h") {
                        result = (input.toDouble() * 1760).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/m") {
                        result = (input.toDouble() * 29.33).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/s") {
                        result = (input.toDouble() * 0.489).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "miles/s") {
                    if (to.lowercase(Locale.ROOT) == "km/h") {
                        result = (input.toDouble() * 5793.638).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "meter/s") {
                        result = (input.toDouble() * 0.0006).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/h") {
                        result = (input.toDouble() * 2236.936).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/m") {
                        result = (input.toDouble() * 58.138).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/s") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/h") {
                        result = (input.toDouble() * 105600).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/m") {
                        result = (input.toDouble() * 1760).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/s") {
                        result = (input.toDouble() * 29.333).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "feet/h") {
                    if (to.lowercase(Locale.ROOT) == "km/h") {
                        result = (input.toDouble() * 0.0003).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "meter/s") {
                        result = (input.toDouble() * 0.0001).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/h") {
                        result = (input.toDouble() * 0.0002).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/m") {
                        result = (input.toDouble() * 0.00003).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/s") {
                        result = (input.toDouble() * 0.000001).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/h") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/m") {
                        result = (input.toDouble() * 0.016).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/s") {
                        result = (input.toDouble() * 0.0003).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "feet/m") {
                    if (to.lowercase(Locale.ROOT) == "km/h") {
                        result = (input.toDouble() * 0.018).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "meter/s") {
                        result = (input.toDouble() * 0.005).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/h") {
                        result = (input.toDouble() * 0.011).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/m") {
                        result = (input.toDouble() * 0.0002).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/s") {
                        result = (input.toDouble() * 0.000004).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/h") {
                        result = (input.toDouble() * 60).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/m") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/s") {
                        result = (input.toDouble() * 0.016).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "feet/s") {
                    if (to.lowercase(Locale.ROOT) == "km/h") {
                        result = (input.toDouble() * 1.097).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "meter/s") {
                        result = (input.toDouble() * 0.305).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/h") {
                        result = (input.toDouble() * 0.681).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/m") {
                        result = (input.toDouble() * 0.018).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles/s") {
                        result = (input.toDouble() * 0.0003).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/h") {
                        result = (input.toDouble() * 3600).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/m") {
                        result = (input.toDouble() * 60).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet/s") {
                        result = input
                    }
                }

            }
            if (type.lowercase(Locale.ROOT) == "length") {
                if (from.lowercase(Locale.ROOT) == "kilometer") {
                    if (to.lowercase(Locale.ROOT) == "kilometer") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "meter") {
                        result = (input.toDouble() * 1000).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles") {
                        result = (input.toDouble() / 1.609).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet") {
                        result = (input.toDouble() * 3280.84).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "inch") {
                        result = (input.toDouble() * 39370.079).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "yard") {
                        result = (input.toDouble() * 1093.613).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "nautical mile") {
                        result = (input.toDouble() / 1.852).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "milimeter") {
                        result = (input.toDouble() * 1000000).toString()
                    }
                    if (from.lowercase(Locale.ROOT) == "meter") {
                        if (to.lowercase(Locale.ROOT) == "kilometer") {
                            result = (input.toDouble() * 0.001).toString()
                        }
                        if (to.lowercase(Locale.ROOT) == "meter") {
                            result = input
                        }
                        if (to.lowercase(Locale.ROOT) == "miles") {
                            result = (input.toDouble() * 0.000621).toString()
                        }
                        if (to.lowercase(Locale.ROOT) == "feet") {
                            result = (input.toDouble() * 3.281).toString()
                        }
                        if (to.lowercase(Locale.ROOT) == "inch") {
                            result = (input.toDouble() * 39.37).toString()
                        }
                        if (to.lowercase(Locale.ROOT) == "yard") {
                            result = (input.toDouble() * 1.094).toString()
                        }
                        if (to.lowercase(Locale.ROOT) == "nautical mile") {
                            result = (input.toDouble() * 0.00054).toString()
                        }
                        if (to.lowercase(Locale.ROOT) == "milimeter") {
                            result = (input.toDouble() * 1000).toString()
                        }
                    }
                }
                if (from.lowercase(Locale.ROOT) == "miles") {
                    if (to.lowercase(Locale.ROOT) == "kilometer") {
                        result = (input.toDouble() * 1.609).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "meter") {
                        result = (input.toDouble() * 1609.344).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "feet") {
                        result = (input.toDouble() * 5280).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "inch") {
                        result = (input.toDouble() * 63360).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "yard") {
                        result = (input.toDouble() * 1760).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "nautical mile") {
                        result = (input.toDouble() / 1.151).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "milimeter") {
                        result = (input.toDouble() * 1609344).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "feet") {
                    if (to.lowercase(Locale.ROOT) == "kilometer") {
                        result = (input.toDouble() * 0.000305).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "meter") {
                        result = (input.toDouble() * 0.305).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles") {
                        result = (input.toDouble() * 0.000189).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "inch") {
                        result = (input.toDouble() * 12).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "yard") {
                        result = (input.toDouble() * 0.333).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "nautical mile") {
                        result = (input.toDouble() * 0.000164).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "milimeter") {
                        result = (input.toDouble() * 304.8).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "inch") {
                    if (to.lowercase(Locale.ROOT) == "kilometer") {
                        result = (input.toDouble() * 0.000025).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "meter") {
                        result = (input.toDouble() * 0.025).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles") {
                        result = (input.toDouble() * 0.000016).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet") {
                        result = (input.toDouble() * 0.083).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "inch") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "yard") {
                        result = (input.toDouble() * 0.027).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "nautical mile") {
                        result = (input.toDouble() * 0.000014).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "milimeter") {
                        result = (input.toDouble() * 25.4).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "yard") {
                    if (to.lowercase(Locale.ROOT) == "kilometer") {
                        result = (input.toDouble() * 0.000914).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "meter") {
                        result = (input.toDouble() * 0.914).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles") {
                        result = (input.toDouble() * 0.000568).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet") {
                        result = (input.toDouble() * 3).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "inch") {
                        result = (input.toDouble() * 36).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "yard") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "nautical mile") {
                        result = (input.toDouble() * 0.000493).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "milimeter") {
                        result = (input.toDouble() * 914.4).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "nautical mile") {
                    if (to.lowercase(Locale.ROOT) == "kilometer") {
                        result = (input.toDouble() * 1.852).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "meter") {
                        result = (input.toDouble() * 1852).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles") {
                        result = (input.toDouble() * 1.151).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet") {
                        result = (input.toDouble() * 6076.115).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "inch") {
                        result = (input.toDouble() * 72913.386).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "yard") {
                        result = (input.toDouble() * 2025.372).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "nautical mile") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "milimeter") {
                        result = (input.toDouble() * 1852000).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "mile") {
                    if (to.lowercase(Locale.ROOT) == "kilometer") {
                        result = (input.toDouble() * 1.609).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "meter") {
                        result = (input.toDouble() * 1609.344).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles") {
                        result = (input.toDouble() * 1).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet") {
                        result = (input.toDouble() * 5280).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "inch") {
                        result = (input.toDouble() * 63360).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "yard") {
                        result = (input.toDouble() * 1760).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "nautical mile") {
                        result = (input.toDouble() * 0.868976).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "milimeter") {
                        result = (input.toDouble() * 1609344).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "milimeter") {
                    if (to.lowercase(Locale.ROOT) == "kilometer") {
                        result = (input.toDouble() * 0.000001).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "meter") {
                        result = (input.toDouble() * 0.001).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "miles") {
                        result = (input.toDouble() * 0.00000062137).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "feet") {
                        result = (input.toDouble() * 0.00328084).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "inch") {
                        result = (input.toDouble() * 0.0393701).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "yard") {
                        result = (input.toDouble() * 0.00109361).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "nautical mile") {
                        result = (input.toDouble() * 0.000000539957).toString()
                    }
                    if (from.lowercase(Locale.ROOT) == "centimeter") {
                        if (to.lowercase(Locale.ROOT) == "kilometer") {
                            result = (input.toDouble() * 0.00001).toString()
                        }
                        if (to.lowercase(Locale.ROOT) == "meter") {
                            result = (input.toDouble() * 0.01).toString()
                        }
                        if (to.lowercase(Locale.ROOT) == "miles") {
                            result = (input.toDouble() * 0.0000062137).toString()
                        }
                        if (to.lowercase(Locale.ROOT) == "feet") {
                            result = (input.toDouble() * 0.0328084).toString()
                        }
                        if (to.lowercase(Locale.ROOT) == "inch") {
                            result = (input.toDouble() * 0.393701).toString()
                        }
                        if (to.lowercase(Locale.ROOT) == "yard") {
                            result = (input.toDouble() * 0.0109361).toString()
                        }
                        if (to.lowercase(Locale.ROOT) == "nautical mile") {
                            result = (input.toDouble() * 0.00000539957).toString()
                        }
                    }
                    if (to.lowercase(Locale.ROOT) == "milimeter") {
                        result = input
                    }
                }


            }
            if (type.lowercase(Locale.ROOT) == "weight") {
                if (from.lowercase(Locale.ROOT) == "kilogram") {
                    if (to.lowercase(Locale.ROOT) == "kilogram") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "gram") {
                        result = (input.toDouble() * 1000).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "pound") {
                        result = (input.toDouble() * 2.205).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "ounce") {
                        result = (input.toDouble() * 35.274).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "stone") {
                        result = (input.toDouble() * 0.157).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "ton") {
                        result = (input.toDouble() * 0.001).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "gram") {
                    if (to.lowercase(Locale.ROOT) == "kilogram") {
                        result = (input.toDouble() * 0.001).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "gram") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "pound") {
                        result = (input.toDouble() * 0.002).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "ounce") {
                        result = (input.toDouble() * 0.035).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "stone") {
                        result = (input.toDouble() * 0.0002).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "ton") {
                        result = (input.toDouble() * 0.000001).toString()
                    }

                }
                if (from.lowercase(Locale.ROOT) == "pound") {
                    if (to.lowercase(Locale.ROOT) == "kilogram") {
                        result = (input.toDouble() * 0.454).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "gram") {
                        result = (input.toDouble() * 453.592).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "pound") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "ounce") {
                        result = (input.toDouble() * 16).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "stone") {
                        result = (input.toDouble() * 0.071).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "ton") {
                        result = (input.toDouble() * 0.0005).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "ounce") {
                    if (to.lowercase(Locale.ROOT) == "kilogram") {
                        result = (input.toDouble() * 0.028).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "gram") {
                        result = (input.toDouble() * 28.35).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "pound") {
                        result = (input.toDouble() * 0.063).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "ounce") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "stone") {
                        result = (input.toDouble() * 0.004).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "ton") {
                        result = (input.toDouble() * 0.00003).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "stone") {
                    if (to.lowercase(Locale.ROOT) == "kilogram") {
                        result = (input.toDouble() * 6.35).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "gram") {
                        result = (input.toDouble() * 6350.293).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "pound") {
                        result = (input.toDouble() * 14).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "ounce") {
                        result = (input.toDouble() * 224).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "stone") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "ton") {
                        result = (input.toDouble() * 0.006).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "ton") {
                    if (to.lowercase(Locale.ROOT) == "kilogram") {
                        result = (input.toDouble() * 907.185).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "gram") {
                        result = (input.toDouble() * 907184.74).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "pound") {
                        result = (input.toDouble() * 2000).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "ounce") {
                        result = (input.toDouble() * 32000).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "stone") {
                        result = (input.toDouble() * 142.857).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "ton") {
                        result = input
                    }
                }
            }


            if (type.lowercase(Locale.ROOT) == "temperature") {
                if (from.lowercase(Locale.ROOT) == "c") {
                    if (to.lowercase(Locale.ROOT) == "c") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "f") {
                        result = (input.toDouble() * 1.8 + 32).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "k") {
                        result = (input.toDouble() + 273.15).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "f") {
                    if (to.lowercase(Locale.ROOT) == "c") {
                        result = ((input.toDouble() - 32) / 1.8).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "f") {
                        result = input
                    }
                    if (to.lowercase(Locale.ROOT) == "k") {
                        result = ((input.toDouble() - 32) / 1.8 + 273.15).toString()
                    }
                }
                if (from.lowercase(Locale.ROOT) == "k") {
                    if (to.lowercase(Locale.ROOT) == "c") {
                        result = (input.toDouble() - 273.15).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "f") {
                        result = ((input.toDouble() - 273.15) * 1.8 + 32).toString()
                    }
                    if (to.lowercase(Locale.ROOT) == "k") {
                        result = input
                    }
                }
            }
        }
        Log.e("last result", result)
        return result
    }
}
