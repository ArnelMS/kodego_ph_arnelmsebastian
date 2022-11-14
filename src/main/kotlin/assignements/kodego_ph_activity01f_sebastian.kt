package assignements

fun main() {
//  ACTIVITY 01 - F
//    Create an application that will accept 2 string inputs.
//    Your application will print all unique characters in both Strings.
//
//    Scope :
//    String
//    Loops

    var stringOne = mutableListOf<Char>()
    var stringTwo = mutableListOf<Char>()

    println("Please enter first word: ")
    var firstWord: String = readln().uppercase()

    println("Please enter second word: ")
    var secondWord: String = readln().uppercase()

    var stringOneLength = firstWord.length
    var stringTwoLength = secondWord.length


    var ctr1: Int = 0
    while (ctr1 <= stringOneLength - 1) {
        stringOne.add(firstWord[ctr1])

        ctr1++
    }
    println()
    var ctr2: Int = 0
    while (ctr2 <= stringTwoLength - 1) {
        stringTwo.add(secondWord[ctr2])

        ctr2++
    }
    println()
    println("----------------------------------------------|")
    println("You have entered the words $firstWord & $secondWord")
    println()
    println("Unique characters are the following:")
    println("First Word")
    println(stringOne.minus(stringTwo))
    println("Second Word")
    println(stringTwo.minus(stringOne))

    println()
    println("------------------------------------------------------|")
    println("- End of Code -")
}
//    println(firstWord subtract secondWord)
//    if (firstWord subtract secondWord != secondWord subtract firstWord) {
//    }else{
//        println("No Unique Characters")
