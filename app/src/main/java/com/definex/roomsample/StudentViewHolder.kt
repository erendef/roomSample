package com.definex.roomsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private var studentItemTextView: TextView

    init {
        studentItemTextView = view.findViewById(R.id.name_surname_textview)
    }

    companion object {
        fun create(parent: ViewGroup): StudentViewHolder {
            val view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_item, parent, false)
            return StudentViewHolder(view)
        }
    }

    fun bind(text: String) {
        studentItemTextView.text = text
    }
}