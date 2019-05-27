fun displayAllWorks(_library: List<Book>) {

    print(
        """
            -----------------------------------

        """.trimIndent()
    )

    _library.forEach {
        it.displayDetail()
        print(
            """

            -----------------------------------

        """.trimIndent()
        )

    }


}