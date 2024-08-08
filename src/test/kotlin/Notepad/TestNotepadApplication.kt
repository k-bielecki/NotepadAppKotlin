package Notepad

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<NotepadApplication>().with(TestcontainersConfiguration::class).run(*args)
}
