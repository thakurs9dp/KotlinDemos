package com.kt.demos.mvvm.repository

import com.kt.demos.mvvm.model.Post
import com.kt.demos.mvvm.network.ApiServicesImp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class ApiServicesRepository @Inject constructor(private val apiServicesImp: ApiServicesImp){

    fun getPost() : Flow<List<Post>> = flow {
        emit(apiServicesImp.getPost())
    }.flowOn(Dispatchers.IO)

}