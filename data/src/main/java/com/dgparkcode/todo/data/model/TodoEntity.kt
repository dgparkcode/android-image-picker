package com.dgparkcode.todo.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dgparkcode.todo.domain.model.Todo
import java.time.LocalDateTime

@Entity(tableName = "todo")
data class TodoEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val title: String,
    val content: String,
    val create: LocalDateTime,
)

internal fun Todo.toEntity() = TodoEntity(
    id = id,
    title = title,
    content = content,
    create = create
)

internal fun TodoEntity.toDomain() = Todo(
    id = id,
    title = title,
    content = content,
    create = create
)