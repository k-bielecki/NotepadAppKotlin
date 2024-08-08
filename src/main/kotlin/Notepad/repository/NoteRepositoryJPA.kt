package Notepad.repository

import Notepad.model.Note
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface NoteRepositoryJPA : JpaRepository<Note, Int> {
}