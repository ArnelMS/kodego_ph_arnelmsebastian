package assignements

fun main() {

    var stringOne = mutableListOf<Char>()
//    var reversedString = mutableListOf<Char>()

    println("Please enter first word: ")
    var firstWord: String = readln().uppercase()
    var stringOneLength = firstWord.length


    var ctr1: Int = 0
    while (ctr1 <= stringOneLength - 1) {
        stringOne.add(firstWord[ctr1])

        ctr1++
    }
    println()
    println("----------------------------------------------|")
    println("You have entered the word: $firstWord")
    println()
    println("If word is reversed:")
    var reverse = stringOne.reversed()
    println(reverse)

    if (stringOne == reverse) {
        println("Your word is a PALINDROME")
    } else if (stringOne != reverse)
        println("Your word is NOT a palindrome")

//    var itr: MutableListIterator<Char> = stringOne.listIterator(stringOne.size)
//    while (itr.hasPrevious()){
//        print(itr.previous())
//    }
//    println()
//    if(stringOne != itr){
//        println("Your word is NOT a PALINDROME")
//    }else{
//        println("Your word is a PALINDROME")

        println()
        println("------------------------------------------------------|")
        println("- End of Code -")
    }
