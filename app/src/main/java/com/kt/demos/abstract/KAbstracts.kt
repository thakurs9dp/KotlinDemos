package com.kt.demos.abstract

//Abstract class use Outside of package any where

abstract class KAbstracts
data class Success(val data: String) : KAbstracts()
data class Failure(val t: Throwable) : KAbstracts()
object Loading : KAbstracts()
object Idl : KAbstracts()

fun getLoadState(load: KAbstracts): Any {
    return when (load) {
        is Success -> {
            load.data
        }
        is Failure -> {
            load.t
        }
        is Loading -> {

        }
        else -> {} // This is exception case
    }
}