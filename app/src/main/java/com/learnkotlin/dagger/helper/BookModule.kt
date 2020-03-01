package com.learnkotlin.dagger.helper

import com.learnkotlin.dagger.model.Book
import com.learnkotlin.dagger.model.Magazine
import com.learnkotlin.dagger.model.RhymesBook
import com.learnkotlin.dagger.model.StoryBook
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
abstract class BookModule{

    @Binds
    @Named("story")
    abstract fun getStoryBook(book: StoryBook) : Book

}