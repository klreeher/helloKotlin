import Book
import java.io.File
import java.nio.file.Paths

fun main() {

    val path = File("audiobook/input/")//.toAbsolutePath().toString()
    val newFile = File.createTempFile("boogies", ".txt", path)

    newFile.writeText("bob eats burgers")

    var newBook = Book(newFile.toString(), "Positive Charge", "adiduck")

   // newBook.displayDetail()

    var newAudiobook = Audiobook(newBook.contentFile, newBook.title, newBook.author, "madecunningly")

   // newAudiobook.displayDetail()

    val library :List<Book> = listOf<Book>(newBook, newAudiobook)

    displayAllWorks(library)

    newFile.deleteOnExit()

}

