package com.definex.roomsample

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.definex.roomsample.db.Student
import com.definex.roomsample.db.StudentRepository

class DbViewModel(application: Application): AndroidViewModel(application) {

    var repository: StudentRepository
    var allStudents: LiveData<List<Student>>

    init {
        repository = StudentRepository(application)
        allStudents = repository.getAllStudents()
    }

    fun insert(student: Student) {
        repository.insert(student)
    }

    fun onResume(){
        allStudents = repository.getAllStudents()
    }

    fun deleteAll() {
        repository.deleteAll()
    }

}