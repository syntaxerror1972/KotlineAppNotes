package com.android.kotlineappnotes.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.android.kotlineappnotes.data.model.Note
import com.android.kotlineappnotes.data.repository.NoteRepository

/**
 **************************************************************************************
 *
 *** Project Details ***
 *
 * Project Name : KotlineAppNotes.
 * Package Id : com.android.kotlineappnotes.ui.viewmodel
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
class NoteViewModel(private val noteRepository: NoteRepository) : ViewModel(){
    fun getNotes() = noteRepository.getNotes()
    fun addNote(note: Note) = noteRepository.addNote(note)
}