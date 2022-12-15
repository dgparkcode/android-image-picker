package com.dgparkcode.todo.domain.model

import java.time.LocalDateTime

data class Todo(
    val id: Long,
    val title: String,
    val content: String,
    val create: LocalDateTime,
)
