package com.dgparkcode.todo.domain.repository

import com.dgparkcode.todo.domain.model.Todo

interface TodoRepository {

    suspend fun insertTodo(todo: Todo)

    suspend fun deleteTodo(todo: Todo)

    suspend fun updateTodo(todo: Todo)

    suspend fun findTodoById(todoId: Long): Todo?
}