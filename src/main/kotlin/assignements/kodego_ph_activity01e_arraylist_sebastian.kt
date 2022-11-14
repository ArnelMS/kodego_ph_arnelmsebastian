package assignements

fun main() {
//  ACTIVITY 01 - E
//    Identify 3 uses cases that will efficiently use an Array, ArrayList, Set, Map.


//    Use of an Array.
//CASE 1  - SHOW LISTS OF ITEMS
    println("------------ ARRAY LIST USE - INVENTORY------|")
    var books = ArrayList<String>()
    books.add("Harry Potter")
    books.add("Math 101")
    books.add("English 101")
    books.add("Accounting 101")
    println(books)
    println()
    println("----------------------------------------------|")
    println()
    println("Please enter new book:")
    var addItem: String = readln()
    books.add(addItem)

    println()
    println("----------------------------------------------|")
    println()
    println("Please see updated list:")
    println(books)
    println()
    println("------------ END OF CASE 1 -----------|")

//CASE 2  - SHOW LISTS OF ITEMS
    println("------------ ARRAY LIST USE - SHOWING LISTS ------|")





}