
fun main(args :Array<String>) {
    // find factorial

    var input = 5
    var factorial = 1

    while (input >0){
        factorial *= input
        input -= 1
    }
    
    print(factorial)
}