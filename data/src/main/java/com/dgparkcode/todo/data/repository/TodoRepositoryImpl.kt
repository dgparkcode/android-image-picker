package com.dgparkcode.todo.data.repository

import com.dgparkcode.todo.data.local.dao.TodoDao
import com.dgparkcode.todo.data.model.toDomain
import com.dgparkcode.todo.data.model.toEntity
import com.dgparkcode.todo.domain.model.Todo
import com.dgparkcode.todo.domain.repository.TodoRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class TodoRepositoryImpl @Inject constructor(
    private val dispatcher: CoroutineDispatcher,
    private val todoDao: TodoDao,
) : TodoRepository {

    override suspend fun insertTodo(todo: Todo) = withContext(dispatcher) {
        todoDao.insertTodo(todo.toEntity())
    }

    override suspend fun deleteTodo(todo: Todo) = withContext(dispatcher) {
        todoDao.deleteTodo(todo.toEntity())
    }

    override suspend fun updateTodo(todo: Todo) = withContext(dispatcher) {
        todoDao.insertTodo(todo.toEntity())
    }

    override suspend fun findTodoById(todoId: Long): Todo? = withContext(dispatcher) {
        return@withContext todoDao.findTodoById(todoId)?.toDomain()
    }
}