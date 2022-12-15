package com.dgparkcode.todo.data.di

import android.content.Context
import androidx.room.Room
import com.dgparkcode.todo.data.local.TodoDatabase
import com.dgparkcode.todo.data.local.dao.TodoDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {

    private const val DB_NAME = "todoDB"

    @Singleton
    @Provides
    fun provideTodoDatabase(@ApplicationContext context: Context): TodoDatabase =
        Room.databaseBuilder(context, TodoDatabase::class.java, DB_NAME).build()

    @Singleton
    @Provides
    fun provideTodoDao(todoDatabase: TodoDatabase): TodoDao = todoDatabase.todoDao
}