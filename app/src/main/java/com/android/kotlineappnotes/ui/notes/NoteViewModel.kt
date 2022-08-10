package com.android.kotlineappnotes.ui.notes

import androidx.lifecycle.ViewModel
import com.android.kotlineappnotes.data.Note
import com.android.kotlineappnotes.data.NoteRepository

class NoteViewModel(private val noteRepository: NoteRepository) : ViewModel(){
    fun getNotes() = noteRepository.getNotes()
    fun addNote(note: Note) = noteRepository.addNote(note)
}