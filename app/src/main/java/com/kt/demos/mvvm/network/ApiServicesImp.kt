package com.kt.demos.mvvm.network

import com.kt.demos.mvvm.model.Post
import javax.inject.Inject

class ApiServicesImp @Inject constructor(private val apiServices: ApiServices) {

    suspend fun getPost() : List<Post>  = apiServices.getPost()
}