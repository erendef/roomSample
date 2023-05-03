package com.definex.roomsample.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

@Database(
    entities = [Student::class],
    version = Constants.dbVersion,
    exportSchema = false
)
abstract class StudentDatabase: RoomDatabase() {

    abstract fun studentDao(): StudentDao

    companion object {
        private var INSTANCE: StudentDatabase? = null
        val databaseWriteExecutor: ExecutorService = Executors.newFixedThreadPool(Constants.NUMBER_OF_THREADS)

        fun getInstance(context: Context): StudentDatabase{
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.applicationContext, StudentDatabase::class.java, Constants.dbName)
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return INSTANCE!!
        }

    }
}