package com.sidrakotlin.dihilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car

    @Inject
    lateinit var main: Main

    @Inject
    @PersonStudent
    lateinit var person: Person

    @Inject
    @PersonEmployee
    lateinit var person2: Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car.getCar()
        main.getName()
        person.getDetails("Sidra",21)
        person2.getDetails("Miss Faiza", 25)
    }
}