package com.biiapps.unitconverter.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import github.com.st235.lib_expandablebottombar.MenuItem

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
        Log.e("****^^****", "input: $input, type: $type, from: $from, to: $to")
        return "0.0"

    }
}