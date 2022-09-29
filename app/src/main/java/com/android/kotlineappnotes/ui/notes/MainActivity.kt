package com.android.kotlineappnotes.ui.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.android.kotlineappnotes.R
import com.android.kotlineappnotes.data.model.Note
import com.android.kotlineappnotes.ui.viewmodel.NoteViewModel
import com.android.kotlineappnotes.utils.InjectorUtils
import java.lang.StringBuilder
import kotlinx.android.synthetic.main.activity_main.*

/**
 **************************************************************************************
 *
 *** Project Details ***
 *
 * Project Name : KotlineAppNotes.
 * Package Id : com.android.kotlineappnotes.ui.notes
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
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUi()
    }

    private fun initUi(){
        val factory = InjectorUtils.provideNotesViewModelFactory()
        val viewModel = ViewModelProviders.of(this,factory)
            .get(NoteViewModel::class.java)
        viewModel.getNotes().observe(this, Observer { notes->
            val stringBuilder=StringBuilder()
            notes.forEach { note->
                stringBuilder.append("$note\n\n")
            }
            txt_notes.text = stringBuilder.toString()
            button_add_note.setOnClickListener{
                val note = Note(editText_note.text.toString(),edt_author.text.toString())
                viewModel.addNote(note)
                editText_note.setText("")
                edt_author.setText("")
            }
        })

    }
}