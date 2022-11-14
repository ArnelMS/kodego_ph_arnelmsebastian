package assignements

fun main() {
//  ACTIVITY 01 - E
//    Identify 3 uses cases that will efficiently use an Array, ArrayList, Set, Map.


//    Use of an Array.
//CASE 1  - SHOW LISTS OF ITEMS
    println("------------ ARRAY USE - SHOWING LISTS ------|")
    var books = arrayOf<String>("Harry Potter", "Math 101", "English 101", "Accounting 101")
    var ctr: Int = 0
    while (ctr < books.size) {
        println(books[ctr])

        ctr++
    }
    println("----------------------------------------------|")
    var ctr2: Int = 0
    while (ctr2 < books.size) {
        println("Please enter new input for index $ctr2")
        books[ctr2] = readln()

        ctr2++
    }

    // Changing List inside arrayOf
    println("----------------------------------------------|")
    var ctr3: Int = 0
        println("New List:")
        while (ctr3 < books.size) {
            println(books[ctr3])
            ctr3++
    }
    println("------------ END OF CASE 1 -----------|")
    println()

//CASE 2  - QUEUEING / ROW AND COLUMN
    println("------------ QUEUEING / ROW AND COLUMN ------|")
    var queue = arrayOf(//0     1    2     3     4
        arrayOf<String>("A1", "A2", "A3", "A4", "A5"),//0
        arrayOf<String>("B1", "B2", "B3", "B4", "B5"),//1
        arrayOf<String>("C1", "C2", "C3", "C4", "C5")//2
    )

    println("Please input Row & Column")
    println("Choose row from 0,1,2")
    var row: Int = readln().toInt()

    println("Choose column from 0,1,2,3,4")
    var column: Int = readln().toInt()

    println(queue[row][column])
    println("------------ END OF CASE 2 -----------|")
    println()

//CASE 3  - ROW AND COLUMN ARRANGEMENT
    println("------------ ROW AND COLUMN ARRANGEMENT ------|")
    var queue2 = arrayOf(//0     1    2     3     4
        arrayOf<String>("A1", "A2", "A3", "A4", "A5"),//0
        arrayOf<String>("B1", "B2", "B3", "B4", "B5"),//1
        arrayOf<String>("C1", "C2", "C3", "C4", "C5"),//2
        arrayOf<String>("D1", "D2", "D3", "D4", "D5"),//3
        arrayOf<String>("E1", "E2", "E3", "E4", "E5") //4
    )

    var row2: Int = 0 //readln().toInt()
    while (row2 < 5) {
        var column2: Int = 0 //readln().toInt()
        while (column2 < 5) {
            print(" ${queue2[row2][column2]},")

            column2++
        }
        println()
        row2++
    }
    println("------------ END OF CASE 3 -----------|")
}
