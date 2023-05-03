package com.definex.roomsample.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface StudentDao {

    @Query(Constants.getStudentsQuery)
    fun getStudents(): LiveData<List<Student>>

    @Insert
    fun insertStudent(student: Student)

    @Delete
    fun deleteStudent(student: Student)

    @Query(Constants.deleteAllQuery)
    fun deleteAllStudent()

    @Update
    fun updateStudent(student: Student)


}