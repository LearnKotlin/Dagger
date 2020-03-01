package com.learnkotlin.dagger.model

import com.learnkotlin.dagger.helper.SubComponentScope
import javax.inject.Inject

class Magazine constructor(){

    @Inject
    constructor(name: String) : this() {
        println("${name} magazine added")
    }

}