package com.dgparkcode.todo.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.dgparkcode.todo.data.local.converter.LocalDateTimeTypeConverter
import com.dgparkcode.todo.data.local.dao.TodoDao
import com.dgparkcode.todo.data.model.TodoEntity

@Database(
    entities = [TodoEntity::class],
    version = 1,
    exportSchema = true
)
@TypeConverters(LocalDateTimeTypeConverter::class)
abstract class TodoDatabase : RoomDatabase() {
    abstract val todoDao: TodoDao
}