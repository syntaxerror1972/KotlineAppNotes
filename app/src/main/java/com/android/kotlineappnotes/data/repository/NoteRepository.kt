package com.android.kotlineappnotes.data.repository

import com.android.kotlineappnotes.data.dao.NoteDao
import com.android.kotlineappnotes.data.model.Note
/**
 **************************************************************************************
 *
 *** Project Details ***
 *
 * Project Name : KotlineAppNotes.
 * Package Id : com.android.kotlineappnotes.data.repository
 * Created By :  Shrawan Shinde
 * Created Date :  30,September,2022
 *
 *** Contact Details ***
 *
 * Name : Shrawan B. Shinde
 * Email : syntaxerror1972@gmail.com
 * Github Link : https://github.com/syntaxerror1972/KotlineAppNotes
 * LinkedIn Link : https://in.linkedin.com/in/shrawan-shinde-59ba57a1
 * Copyright (c) 2022. All rights reserved.
 *
 **************************************************************************************
 */
class NoteRepository private constructor(private val noteDao: NoteDao){

    fun addNote(note: Note){
        noteDao.addNote(note)
    }

    fun getNotes() = noteDao.getNotes()

    companion object{
        @Volatile private var instance: NoteRepository? = null
        fun getInstance(noteDao: NoteDao) = instance ?: synchronized(this){
            instance ?: NoteRepository(noteDao).also { instance = it }
        }
    }
}