package com.example.modul9_praktikum

import androidx.lifecycle.LiveData

class WordRepository(private val wordDao: WordDao) {
    val allWords: LiveData<List<word>> = wordDao.getAlphabetizedWords()
    suspend fun insert(word: word) {
        wordDao.insert(word)
    }
}
