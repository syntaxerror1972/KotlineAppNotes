package com.android.kotlineappnotes.utils

import com.android.kotlineappnotes.data.db.NoteDatabase
import com.android.kotlineappnotes.data.repository.NoteRepository
import com.android.kotlineappnotes.ui.viewmodel.NotesViewModelFactory

/**
 **************************************************************************************
 *
 *** Project Details ***
 *
 * Project Name : KotlineAppNotes.
 * Package Id : com.android.kotlineappnotes.utils
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
object InjectorUtils {
    fun provideNotesViewModelFactory(): NotesViewModelFactory {
        val noteRepository = NoteRepository.getInstance(NoteDatabase.getInstance().noteDao)
        return NotesViewModelFactory(noteRepository)
    }
}