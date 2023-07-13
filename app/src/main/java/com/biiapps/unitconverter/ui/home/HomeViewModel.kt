package com.biiapps.unitconverter.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import github.com.st235.lib_expandablebottombar.MenuItem
import java.util.Locale

@Suppress("UNREACHABLE_CODE")
class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    var curChoice = 0
    val text: LiveData<String> = _text


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
        "Celsius",
        "Fahrenheit",
        "Kelvin"
    )

    fun showResult(input: String, type: String, from: String, to: String): String {
        var result = ""
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
        }
        if (type.lowercase(Locale.ROOT) == "length") {
            if (from.lowercase(Locale.ROOT) == "km") {
                if (to.lowercase(Locale.ROOT) == "km") {
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
        }
        if (type.lowercase(Locale.ROOT) == "temperature") {
            if (from.lowercase(Locale.ROOT) == "celsius") {
                if (to.lowercase(Locale.ROOT) == "celsius") {
                    result = input
                }
                if (to.lowercase(Locale.ROOT) == "fahrenheit") {
                    result = (input.toDouble() * 1.8 + 32).toString()
                }
                if (to.lowercase(Locale.ROOT) == "kelvin") {
                    result = (input.toDouble() + 273.15).toString()
                }
            }
        }
        Log.e("last result", result)
        return result
    }
}
