package com.kt.demos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kt.demos.abstract.Success
import com.kt.demos.abstract.getLoadState
import com.kt.demos.enum.KEnum
import com.kt.demos.utils.getNetworkState

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Enum
        Log.d("TAG_TAG", "-- Connected --- ${getNetworkState(KEnum.DISCONNECTED)}")
        Log.d("TAG_TAG", "-- Connected --- ${getNetworkState(KEnum.DISCONNECTED)}")
        Log.d("TAG_TAG", "-- Connected --- ${getLoadState(Success("My Data"))}")


    }


}