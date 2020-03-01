package com.learnkotlin.dagger.helper

import android.app.Activity
import dagger.Subcomponent

@Subcomponent
@SubComponentScope
interface SubComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): SubComponent?
    }

    fun inject(activity: Activity?)

}