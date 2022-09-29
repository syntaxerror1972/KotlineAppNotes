package com.android.kotlineappnotes.data.model

/**
 **************************************************************************************
 *
 *** Project Details ***
 *
 * Project Name : KotlineAppNotes.
 * Package Id : com.android.kotlineappnotes.data.model
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
data class Note(val noteText:String,val authorText:String) {
    override fun toString(): String {
        return "$noteText - $authorText"
    }

}