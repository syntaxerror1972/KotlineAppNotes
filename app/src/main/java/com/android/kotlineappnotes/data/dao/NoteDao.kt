package com.android.kotlineappnotes.data.dao

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.kotlineappnotes.data.model.Note

/**
 **************************************************************************************
 *
 *** Project Details ***
 *
 * Project Name : KotlineAppNotes.
 * Package Id : com.android.kotlineappnotes.data.dao
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
class NoteDao {
    private val noteList = mutableListOf<Note>()
    private val notes = MutableLiveData<List<Note>>()

    init {
        notes.value=noteList
    }

    fun addNote(note: Note){
        noteList.add(note)
        notes.value = noteList
    }

    fun getNotes() = notes as LiveData<List<Note>>
}