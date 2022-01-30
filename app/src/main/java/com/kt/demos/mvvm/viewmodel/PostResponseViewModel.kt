package com.kt.demos.mvvm.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kt.demos.mvvm.repository.ApiServicesRepository
import com.kt.demos.mvvm.utils.ApiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PostResponseViewModel @Inject constructor(private val apiServicesRepository: ApiServicesRepository)  : ViewModel(){

    //This variable change the data
    private val postStateFlow : MutableStateFlow<ApiState> = MutableStateFlow(ApiState.Empty)

    //Observer the data in activity
    val _postStateFlow : StateFlow<ApiState> = postStateFlow

    fun getPost() = viewModelScope.launch {
        postStateFlow.value = ApiState.Loading
        apiServicesRepository.getPost()
            .catch { e ->
                postStateFlow.value = ApiState.Failure(e)
            }
            .collect {response ->
                postStateFlow.value = ApiState.Success(response)
            }
    }

}