package com.kt.demos.mvvm.view.postresponse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.kt.demos.R
import com.kt.demos.mvvm.utils.ApiState
import com.kt.demos.mvvm.viewmodel.PostResponseViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class ServerDemoActivity : AppCompatActivity() {
    private val postViewModel : PostResponseViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_server_demo)
        postViewModel.getPost()
        lifecycleScope.launchWhenStarted {
            postViewModel._postStateFlow.collect {
                when(it) {

                    is ApiState.Loading ->{

                    }
                    is  ApiState.Failure -> {

                    }
                    is ApiState.Success -> {
                        Log.d("Data_is", "Success data is ${it.data}")
                    }
                    is ApiState.Empty ->{

                    }
                }
            }
        }

    }


}