package Notepad.repository

import Notepad.model.Note
import org.springframework.stereotype.Repository

@Repository
class NotePostreSQLRepository (private val noteRepositoryJPA: NoteRepositoryJPA) : NoteRepository {

    override fun getAllNotes(): List<Note> {
        return noteRepositoryJPA.findAll()
    }

    override fun getNoteById(id: Int): Note? {
        return noteRepositoryJPA.findById(id).orElseThrow()
    }

    override fun addNote(note: Note): Note? {
        return noteRepositoryJPA.save(note)
    }

    override fun updateNote(id: Int, note: Note): Note? {
        return if (noteRepositoryJPA.findById(id).isEmpty) null else noteRepositoryJPA.save(note)
    }

    override fun deleteNoteById(id: Int) {
        noteRepositoryJPA.deleteById(id)
    }
}