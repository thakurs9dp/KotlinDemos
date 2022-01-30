package com.kt.demos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kt.demos.abstract.Success
import com.kt.demos.abstract.getLoadState
import com.kt.demos.didemos.Car
import com.kt.demos.didemos.Engine
import com.kt.demos.enum.KEnum
import com.kt.demos.utils.getNetworkState
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}