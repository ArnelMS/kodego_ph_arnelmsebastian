package assignements

fun main() {
//  ACTIVITY 01 - G
//    Create an application that will accept 1 string.
//    Your application will print “Palindrome” if the string is a palindrome.
//    Scope :
//    String
//    Loops
//
//    Ex :
//    GIRAFARIG - Palindrome
//    101 - Palindrome
//    RACECAR - Palimdrome
//    GATE - Not Palindrome

    var stringOne = mutableListOf<Char>()
    var reversedString = mutableListOf<Char>()

    println("Please enter first word: ")
    var firstWord: String = readln().uppercase()

//    println("Please enter second word: ")
//    var secondWord: String = readln().uppercase()

    var stringOneLength = firstWord.length
//    var stringTwoLength = secondWord.length


    var ctr1: Int = 0
    while (ctr1 <= stringOneLength - 1) {
        stringOne.add(firstWord[ctr1])

        ctr1++
    }
    println()
    var ctr2: Int = 0
    while (ctr2 < stringOneLength-1) {
        reversedString.add(firstWord[ctr2])

        ctr2--
    }
    println()
    println("----------------------------------------------|")
    println("You have entered the word: $firstWord")
    println()
    println("If word is reversed:")
    println("The word is $reversedString")

//    println("------------------------------------------------------|")
//    println("------------------------------------------------------|")
//    println("First Word")
//    println(stringOne.minus(stringTwo))
//    println("Second Word")
//    println(stringTwo.minus(stringOne))

    println()
    println("------------------------------------------------------|")
    println("- End of Code -")
}
//    println(firstWord subtract secondWord)
//    if (firstWord subtract secondWord != secondWord subtract firstWord) {
//    }else{
//        println("No Unique Characters")
