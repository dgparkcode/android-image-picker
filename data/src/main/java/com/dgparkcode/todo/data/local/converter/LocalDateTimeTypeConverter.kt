package com.dgparkcode.todo.data.local.converter

import androidx.room.TypeConverter
import java.time.LocalDateTime

class LocalDateTimeTypeConverter {

    @TypeConverter
    fun localDateTimeToString(localDateTime: LocalDateTime?): String? = localDateTime?.toString()

    @TypeConverter
    fun stringToLocalDateTime(string: String?): LocalDateTime? = string?.let { LocalDateTime.parse(it) }
}