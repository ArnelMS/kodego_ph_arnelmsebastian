package assignements

fun main(){
//  ACTIVITY 01 - B
//  You are tasked to automate a school’s library.
//  Identify the items that can be borrowed in a Library.
//  After listing the different items, identify the characteristics of the items.
//  Use the proper data types.

    var book1: String = "Harry Potter"
    var type1: String = "Fantasy"
    var bookcode1: Int = 2022001
    var available1: Char = 'Y'
    var quantity1: Int = 2

    var book2: String = "Math 101"
    var type2: String = "Math"
    var bookcode2: Int = 2022005
    var available2: Char = 'Y'
    var quantity2: Int = 2

    var book3: String = "English 101"
    var type3: String = "English"
    var bookcode3: Int = 2022035
    var available3: Char = 'Y'
    var quantity3: Int = 2

    var book4: String = "Accounting 101"
    var type4: String = "Accounting"
    var bookcode4: Int = 2022043
    var available4: Char = 'Y'
    var quantity4: Int = 2


    println("----------------------------------------------|")
    println("Available Books:")
    println("----------------------------------------------|")
    println(book1)
    println(book2)
    println(book3)
    println(book4)
    println("----------------------------------------------|")

    println()
    println("Please enter book title for complete details:")
    var bookTitle: String = readln()
//    println("Book Title: $bookTitle")
    println("----------------------------------------------|")


    if (bookTitle == book1) {
        println("Book Title : $book1")
        println("Book Type  : $type1")
        println("Book code  : $bookcode1")
        println("Quantity   : $quantity1")
        println("Available  : $available1")
    }

    if (bookTitle == book2) {
        println("Book Title : $book2")
        println("Book Type  : $type2")
        println("Book code  : $bookcode2")
        println("Quantity   : $quantity2")
        println("Available  : $available2")
    }

    if (bookTitle == book3) {
        println("Book Title : $book3")
        println("Book Type  : $type3")
        println("Book code  : $bookcode3")
        println("Quantity   : $quantity3")
        println("Available  : $available3")
    }

    if (bookTitle == book4) {
        println("Book Title : $book4")
        println("Book Type  : $type4")
        println("Book code  : $bookcode4")
        println("Quantity   : $quantity4")
        println("Available  : $available4")
    }
    println("----------------------------------------------|")
    println("- End of Code -")




}