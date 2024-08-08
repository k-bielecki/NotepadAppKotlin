package Notepad.repository

import Notepad.model.Note

class NoteRepositoryInMemory : NoteRepository {

    private val noteMap = HashMap<Int, Note>()

    override fun getAllNotes(): List<Note> {
        return noteMap.values.toList()
    }

    override fun getNoteById(id: Int): Note? {
        return noteMap.get(id)
    }

    override fun addNote(note: Note): Note? {
        return noteMap.put(note.id, note)
    }

    override fun updateNote(id: Int, note: Note): Note? {
        if (noteMap.get(id) == null) {
            return null
        } else {
            return noteMap.put(id, note)
        }
    }

    override fun deleteNoteById(id: Int) {
        noteMap.remove(id)
    }
}