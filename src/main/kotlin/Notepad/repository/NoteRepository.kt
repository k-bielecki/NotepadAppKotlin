package Notepad.repository

import Notepad.model.Note

interface NoteRepository {

    fun getAllNotes(): List<Note>
    fun getNoteById(id: Int): Note?
    fun addNote(note: Note): Note?
    fun updateNote(id: Int, note: Note): Note?
    fun deleteNoteById(id: Int)
}