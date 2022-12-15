package com.dgparkcode.todo.domain.model

import java.time.LocalDate

data class Todo(
    val id: Long,
    val title: String,
    val content: String,
    val create: LocalDate,
)
