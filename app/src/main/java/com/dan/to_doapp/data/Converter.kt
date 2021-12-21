package com.dan.to_doapp.data

import androidx.room.TypeConverter
import com.dan.to_doapp.data.model.Priority

class Converter {

    @TypeConverter
    fun fromPriority(priority: Priority): String {
        return priority.name
    }

    @TypeConverter
    fun toPriority(priority: String): Priority {
        return Priority.valueOf(priority)
    }

}