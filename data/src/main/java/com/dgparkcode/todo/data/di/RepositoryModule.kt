package com.dgparkcode.todo.data.di

import com.dgparkcode.todo.data.local.dao.TodoDao
import com.dgparkcode.todo.data.repository.TodoRepositoryImpl
import com.dgparkcode.todo.domain.repository.TodoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideTodoRepository(@IoDispatcher dispatcher: CoroutineDispatcher, todoDao: TodoDao): TodoRepository =
        TodoRepositoryImpl(dispatcher, todoDao)
}