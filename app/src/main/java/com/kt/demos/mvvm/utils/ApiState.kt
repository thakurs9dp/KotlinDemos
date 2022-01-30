package com.kt.demos.mvvm.utils

import com.kt.demos.mvvm.model.Post

sealed class ApiState {
    object Loading : ApiState()
    class Failure(val msg : Throwable) : ApiState()
    class Success(val data : List<Post>) : ApiState()
    object Empty : ApiState()
}
