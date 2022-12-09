package com.sidrakotlin.dihilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class PersonModule {

    @Provides
    @PersonEmployee
    fun EmployeeDetail(employee: Employee): Person{
        return Employee()
    }

    @Provides
    @PersonStudent
    fun StudentDetail(student: Student):Person{
        return Student()
    }
}