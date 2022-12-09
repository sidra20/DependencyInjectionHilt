package com.sidrakotlin.dihilt

import android.util.Log
import javax.inject.Inject

interface Person{
    fun getDetails(name:String, age:Int)
}

class Employee @Inject constructor():Person{
    override fun getDetails(name: String, age: Int) {
        Log.d("main2","Employee name is $name and age is $age")
    }

}

class Student @Inject constructor():Person{
    override fun getDetails(name: String, age: Int) {
        Log.d("main2","Student name is $name and age is $age")
    }
}

