package com.definex.roomsample.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = Constants.tableName)
data class Student(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = Constants.studentIdColumnName)
    var studentId: Int = 0,

    @ColumnInfo(name = Constants.studentNameColumnName)
    var name: String,

    @ColumnInfo(name = Constants.studentSurnameColumnName)
    var surname: String
)