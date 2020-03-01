package com.learnkotlin.dagger.model

import com.learnkotlin.dagger.helper.SubComponentScope
import javax.inject.Inject

class RhymesBook constructor() : Book {

    @Inject
    constructor(name: String) : this() {
        println("RhymesBook - Author ${name} added")
    }

}