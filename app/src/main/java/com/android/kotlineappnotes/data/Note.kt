package com.android.kotlineappnotes.data

data class Note(val noteText:String,val authorText:String) {
    override fun toString(): String {
        return "$noteText - $authorText"
    }

}