package com.kt.demos.didemos

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine, private val wheel: Wheel) {
    fun getCar() {
        Log.d("TAG", "The car is : ")
    }
}