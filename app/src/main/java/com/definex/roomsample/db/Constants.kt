package com.definex.roomsample.db

class Constants {
    companion object {
        const val tableName = "students"
        const val studentIdColumnName = "studentId"
        const val studentNameColumnName = "studentName"
        const val studentSurnameColumnName = "studentSurname"
        const val dbName = "studentDatabase"
        const val dbVersion = 1
        const val NUMBER_OF_THREADS = 3
        const val getStudentsQuery = "SELECT * FROM $tableName"
        const val deleteAllQuery = "Delete from $tableName"
        const val getStudentByNameQuery = "Select * from $tableName"
        const val getStudentBysurnameQuery = "Select * from $tableName"
    }
}