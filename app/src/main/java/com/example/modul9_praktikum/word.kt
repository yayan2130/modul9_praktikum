package com.example.modul9_praktikum

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="word_table")
data class word(@PrimaryKey @ColumnInfo(name = "word") val word: String)