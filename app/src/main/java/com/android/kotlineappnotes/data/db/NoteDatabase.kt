package com.android.kotlineappnotes.data.db

import com.android.kotlineappnotes.data.dao.NoteDao
/**
 **************************************************************************************
 *
 *** Project Details ***
 *
 * Project Name : KotlineAppNotes.
 * Package Id : com.android.kotlineappnotes.data.db
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
class NoteDatabase private constructor(){

    var noteDao = NoteDao()


    companion object{
        @Volatile private var instance: NoteDatabase? = null
            fun getInstance() = instance ?: synchronized(this){
                instance ?: NoteDatabase().also { instance = it }
            }
    }
}