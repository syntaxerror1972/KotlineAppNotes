package com.android.kotlineappnotes.ui.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.android.kotlineappnotes.R
import com.android.kotlineappnotes.data.Note
import com.android.kotlineappnotes.utilities.InjectorUtils
import java.lang.StringBuilder
import kotlinx.android.synthetic.main.activity_main.*

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