package com.android.kotlineappnotes.utilities

import com.android.kotlineappnotes.data.FakeDatabase
import com.android.kotlineappnotes.data.NoteRepository
import com.android.kotlineappnotes.ui.notes.NotesViewModelFactory

object InjectorUtils {
    fun provideNotesViewModelFactory(): NotesViewModelFactory {
        val noteRepository = NoteRepository.getInstance(FakeDatabase.getInstance().noteDao)
        return NotesViewModelFactory(noteRepository)
    }
}