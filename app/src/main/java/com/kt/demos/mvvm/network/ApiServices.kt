package com.kt.demos.mvvm.network

import com.kt.demos.mvvm.model.Post
import retrofit2.http.GET

interface ApiServices {

    @GET("posts")
    suspend fun getPost() : List<Post>
}