package com.android.kotlineappnotes.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
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
class NotesViewModelFactory(private val noteRepository: NoteRepository) : ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NoteViewModel(noteRepository) as T
    }
}