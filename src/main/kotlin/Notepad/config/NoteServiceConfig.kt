package Notepad.config

import Notepad.repository.NoteRepository
import Notepad.repository.NoteRepositoryInMemory
import Notepad.service.NoteService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class NoteServiceConfig {

    @Bean
    fun springContext(noteRepository: NoteRepository): NoteService {
        return NoteService(noteRepository)
    }

    fun testInMemory(): NoteService {
        val noteRepository = NoteRepositoryInMemory()
        return NoteService(noteRepository)
    }
}