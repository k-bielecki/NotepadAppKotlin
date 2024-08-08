package Notepad.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
data class Note (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    var title: String,
    var author: String,
    var content: String,
    var createdDate: LocalDateTime? = null) {

}