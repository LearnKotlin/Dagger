package com.learnkotlin.dagger.helper

import com.learnkotlin.dagger.MainActivity
import dagger.Component


@Component(modules = [BookModule::class, ParameterizedBookModule::class, SubModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
    fun subComponent(): SubComponent.Factory?
}