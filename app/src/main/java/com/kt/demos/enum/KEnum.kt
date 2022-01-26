package com.kt.demos.enum

//Enum contains set of constants values
//Enum classes are behind of seen it is abstract class
enum class KEnum {
    CONNECTED,
    DISCONNECTED
}


//Only Use similar data types
enum class Network(val enable : Boolean) {
    CONNECTED(enable = true),
    DISCONNECTED(enable = false)
}