package com.sidrakotlin.dihilt

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

interface One{
    fun getName()
}

class OneImplement @Inject constructor():One{
    override fun getName() {
        Log.d("main","My name is Sidra")
    }

}

class Main @Inject constructor(private val one: One)
{
    fun getName()
    {
        one.getName()
    }
}

@Module
@InstallIn(SingletonComponent::class)
abstract class MyModule{

    @Binds
    abstract fun bindings(oneImplement: OneImplement): One
}