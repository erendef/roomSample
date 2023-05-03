package com.definex.roomsample

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.definex.roomsample.db.Student

class StudentAdapter(diffUtil: DiffUtil.ItemCallback<Student>): ListAdapter<Student, StudentViewHolder>(diffUtil) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        return StudentViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        var student = getItem(position) as Student
        holder.bind("${student.name} ${student.surname}")
    }
}