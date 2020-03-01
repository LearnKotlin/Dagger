package com.learnkotlin.dagger.helper

import com.learnkotlin.dagger.model.Book
import com.learnkotlin.dagger.model.Magazine
import com.learnkotlin.dagger.model.RhymesBook
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ParameterizedBookModule constructor(val author: String, val magazineName: String) {

    @Provides
    @Named("rhymes")
    fun getRhymesBook() : Book{
        return RhymesBook(author)
    }

    @Provides
    fun getMagazine() : Magazine{
        return Magazine(magazineName)
    }


}