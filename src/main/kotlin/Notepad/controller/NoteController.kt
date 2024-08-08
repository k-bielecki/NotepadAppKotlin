package Notepad.controller

import Notepad.model.Note
import Notepad.service.NoteService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/notes")
class NoteController(private val noteService: NoteService) {

    @GetMapping
    fun getAllNotes(): List<Note> {
        return noteService.getAllNotes()
    }

    @GetMapping("/{id}")
    fun getNoteById(@PathVariable id: Int): Note? {
        return noteService.getNoteById(id)
    }

    @PostMapping
    fun addNote(note: Note): Note? {
        return noteService.addNote(note)
    }

    @PutMapping
    fun updateNote(id: Int, note: Note): Note? {
        return noteService.updateNote(id, note)
    }

    @DeleteMapping("/{id}")
    fun deleteNoteById(@PathVariable id: Int) {
        noteService.deleteNote(id)
    }
}