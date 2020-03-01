package com.learnkotlin.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learnkotlin.dagger.helper.Stand
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var libraryStand: Stand

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as DaggerApplication).daggerComponent().inject(this)
        println("---------added Stand1-------------")
        var stand = libraryStand

        (application as DaggerApplication).daggerComponent().inject(this)
        println("---------added Stand2-------------")

        if(stand != libraryStand){
            println("added two differnt stands")
        }





        println("------To return a same object we need to add Attach Scope annotation----------")

        var subComonent = (application as DaggerApplication).daggerComponent().subComponent()?.create()
        subComonent?.inject(this)

        var scStand = libraryStand

        subComonent?.inject(this)

        println("---------added stands twice to Sub Component-------------")
        if(scStand == libraryStand){
            println("But added same  stands")
        }


    }
}
