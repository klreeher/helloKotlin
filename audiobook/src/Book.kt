import java.io.File

open class Book(_contentFile: String, _title: String, _author: String) {
    //todo: author should be an instance of a person class

    var author: String = ""
    var title: String = ""
    var contentFile: String

    init {
        this.contentFile = _contentFile
        this.title = _title
        this.author = _author
    }

// if i want to set the length as part of the constructor, how to reference?
    fun getLength() :Int{
        var numOfWords :Int = 0

        val file = File(this.contentFile)
        val bufferedReader = file.bufferedReader()
        val text: List<String> = bufferedReader.readLines()
        for (line in text) {
            numOfWords += line.split(" ").count()
        }

        return numOfWords

    }

    open fun displayDetail() {
        print("""

            Title: ${this.title.toString()}
            Author: ${this.author.toString()}
            Length: ${getLength()} words long.
        """.trimIndent())
    }

    open fun displayWork() {
        // must be overloaded for each subtype

        val file = File(this.contentFile)
        val bufferedReader = file.bufferedReader()
        val text: List<String> = bufferedReader.readLines()
        for (line in text) {

            print("\n $line")
        }


    }

}