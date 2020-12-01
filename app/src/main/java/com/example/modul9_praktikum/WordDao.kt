package com.example.modul9_praktikum

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface WordDao {
    @Query("Select * from word_table ORDER BY word ASC")
    fun getAlphabetizedWords(): LiveData<List<word>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: word)

    @Query("DELETE FROM word_table")
    suspend fun deleteAll()

}
