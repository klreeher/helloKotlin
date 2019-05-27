class Audiobook(_contentFile :String, _title :String, _author :String, _reader :String) : Book(_contentFile, _title, _author) {

    var reader :String = _reader

    override fun displayDetail(){
        super.displayDetail()
        print("""

            Reader: ${this.reader}
        """.trimIndent())
    }


}

