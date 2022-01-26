package com.kt.demos.utils

import com.kt.demos.enum.KEnum
import com.kt.demos.enum.Network

fun getNetworkState(network: KEnum): String {
   return when (network) {
        KEnum.CONNECTED -> {
            "Network Connected"
        }
        KEnum.DISCONNECTED -> {
            "Network Disconnected"
        }
    }
}


fun getNetworkState(network: Network) : Boolean {
    return when(network) {
        Network.CONNECTED ->{
            network.enable
        }
        Network.DISCONNECTED -> {
            network.enable
        }
    }
}