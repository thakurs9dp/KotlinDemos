package com.kt.demos.didemos

import android.util.Log
import javax.inject.Inject

class Wheel {

    @Inject
    constructor()

    fun getWheel() {
        Log.d("TAG", "Get Wheel")
    }
}