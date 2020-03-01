package com.learnkotlin.dagger

import android.app.Application
import com.learnkotlin.dagger.helper.AppComponent
import com.learnkotlin.dagger.helper.DaggerAppComponent
import com.learnkotlin.dagger.helper.ParameterizedBookModule

class DaggerApplication : Application() {

    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder().parameterizedBookModule(ParameterizedBookModule("Santhosh", "Times")).build()
    }

    fun daggerComponent() = component
}