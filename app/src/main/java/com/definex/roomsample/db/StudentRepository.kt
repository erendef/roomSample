package com.definex.roomsample.db

import android.app.Application
import androidx.lifecycle.LiveData

class StudentRepository(application: Application) {

    private var studentDao: StudentDao
    private var allStudents: LiveData<List<Student>>

    init {
        val studentDatabase = StudentDatabase.getInstance(application)
        studentDao = studentDatabase.studentDao()
        allStudents = studentDao.getStudents()
    }

    fun getAllStudents(): LiveData<List<Student>> {
        return allStudents
    }

    fun insert(student: Student) {
        StudentDatabase.databaseWriteExecutor?.execute{
            studentDao.insertStudent(student)
        }
    }

    fun deleteAll() {
        StudentDatabase.databaseWriteExecutor?.execute{
            studentDao.deleteAllStudent()
        }
    }

}