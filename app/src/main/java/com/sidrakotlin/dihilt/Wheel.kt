package com.sidrakotlin.dihilt

import android.util.Log
import javax.inject.Inject

class Wheel @Inject constructor() {
    fun getWheel(){
        Log.d("Main","Wheels are moving.")
    }
}