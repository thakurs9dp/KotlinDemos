package com.kt.demos.oops

//This is called class
class KOops {
    val color : String = "Red"
    fun getSum() : Int {
        return 4 + 5
    }
}


fun main() {
    //Create object of class
    val kOops = KOops()

    // call the functions
    kOops.getSum()
    kOops.color

}