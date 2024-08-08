package Notepad.service

import Notepad.model.Note
import Notepad.repository.NoteRepository
import Notepad.repository.NoteRepositoryJPA
import org.springframework.stereotype.Service

@Service
class NoteService(private val noteRepository: NoteRepository) {

    fun getAllNotes(): List<Note> {
        return noteRepository.getAllNotes()
    }

    fun getNoteById(id: Int): Note? {
        return noteRepository.getNoteById(id)
    }

    fun addNote(note: Note): Note? {
        return noteRepository.addNote(note)
    }

    fun updateNote(id: Int, note: Note): Note? {
        return noteRepository.updateNote(id, note)
    }

    fun deleteNote(id: Int) {
        noteRepository.deleteNoteById(id)
    }
}