package com.android.kotlineappnotes.ui.notes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.android.kotlineappnotes.data.NoteRepository

class NotesViewModelFactory(private val noteRepository: NoteRepository) : ViewModelProvider.NewInstanceFactory(){

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NoteViewModel(noteRepository) as T
    }
}