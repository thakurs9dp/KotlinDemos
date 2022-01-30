package com.kt.demos.didemos

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

//class MInterface @Inject constructor(val name : String) : Test {
//    override fun getName() {
//        Log.d("The_Name", "Name is $name")
//    }
//}
//
//interface Test {
//    fun getName()
//}
//
//@Module
//@InstallIn(SingletonComponent::class)
//abstract class AppModule() {
//
//    @Provides
//    @Singleton
//    fun nameValue() : String = "Shivansh"
//
//    @Provides
//    @Singleton
//    fun getTest(name: String) : Test = MInterface(name)
//
//}