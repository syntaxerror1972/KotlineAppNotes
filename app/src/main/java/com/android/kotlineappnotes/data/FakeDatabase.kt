package com.android.kotlineappnotes.data

class FakeDatabase private constructor(){

    var noteDao = FakeNoteDao()


    companion object{
        @Volatile private var instance: FakeDatabase? = null
            fun getInstance() = instance?: synchronized(this){
                instance?:FakeDatabase().also { instance = it }
            }
    }
}