package com.learnkotlin.dagger.model

import com.learnkotlin.dagger.helper.SubComponentScope
import javax.inject.Inject

class GeneralKnowledgeBook @Inject constructor() {

    init {
        println("GeneralKnowledge book added")
    }
}