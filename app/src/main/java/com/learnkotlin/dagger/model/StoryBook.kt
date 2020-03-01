package com.learnkotlin.dagger.model

import com.learnkotlin.dagger.helper.SubComponentScope
import javax.inject.Inject

class StoryBook @Inject constructor(): Book {

    init {
        println("StoryBook added")
    }

}