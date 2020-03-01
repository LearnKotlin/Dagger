package com.learnkotlin.dagger.helper

import com.learnkotlin.dagger.model.Book
import com.learnkotlin.dagger.model.GeneralKnowledgeBook
import com.learnkotlin.dagger.model.Magazine
import javax.inject.Inject
import javax.inject.Named

class Stand @Inject constructor(val book1: GeneralKnowledgeBook, val magazine: Magazine, @Named("story") val book2: Book, @Named("rhymes") val book3: Book) {

    init {
        println("Stand added to library")
    }

}