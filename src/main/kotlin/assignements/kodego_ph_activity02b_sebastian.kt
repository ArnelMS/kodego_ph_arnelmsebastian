fun main(){

//  Activity 02 - B
//  Implement Activity 01 -  B using data structure.

    var studentsList = ArrayList<String>()
    var student_borrow = ArrayList<String>()
    var booklists = ArrayList<String>()
    var dateBorrowed = ArrayList<String>()


    booklists.add("Harry Potter")
    booklists.add("Math 101")
    booklists.add("English 101")
    booklists.add("Accounting 101")


    studentsList.add("Juan Dela Cruz")
    studentsList.add("Karen Smith")
    studentsList.add("Pepito Manoloto")
    studentsList.add("Marites Aksaya")


    var ctr: Int = 0
    do {
        println()
        println("********* OPTIONS *********")
        println("[1] Student List")
        println("[2] New student")
        println("[3] List of books")
        println("[4] Add a book")
        println("[5] Borrow a book")
        println("[6] Return a book")
        println("[7] Exit")
        println("****************************")
        print("Select Options: ")
        var options: Int = readln().toInt()

        //options
        var select: Int = options
        do {
            // Student list and students with borrowed books
            if (options.toInt() == 1){
                println("*** Student List ***")
                println(studentsList)
                println()
                println("- With existing books -")
                println("$student_borrow $dateBorrowed")
                break
                select++

                // Add new student
            }else if (options.toInt() == 2){
                println("*** New student ***")
                println("Please Complete Details")

                print("Enter Firstname  : ")
                var firstName = readln().toString()
                print("Enter Lastname   : ")
                var lastName = readln().toString()

                studentsList.add("$firstName $lastName")
                break
                select++

                // List of books available
            } else if (options.toInt() == 3) {
                println("*** List of books ***")
                println(booklists)

                break
                select++

                // Add New book on Stock
            } else if (options.toInt() == 4) {
                // BOOK DETAILS
                print("Enter Book Title : ")
                var bookTitle = readln().toString()

                booklists.add("$bookTitle")
                println(booklists)

                break
                select++

                // BORROW A BOOK
            } else if (options.toInt() == 5) {
                println("*** Borrow a book ***")
                println("Enter Firstname  : ")
                var firstName = readln().toString()
                println("Enter Lastname   : ")
                var lastName = readln().toString()
                println("Book Title       : ")
                var bookTitle = readln().toString()
                println("Date Borrowed    : ")
                var dateborrowed = readln().toString()

                student_borrow.add("$firstName $lastName")
                student_borrow.add("$bookTitle")
                dateBorrowed.add("$dateborrowed")
                booklists.remove("$bookTitle")
                println("$student_borrow, $dateborrowed")

                break
                select++

                // RETURN A BOOK
            } else if (options.toInt() == 6) {
                println("*** Return a book ***")
                println("Enter Firstname  : ")
                var firstName = readln().toString()
                println("Enter Lastname   : ")
                var lastName = readln().toString()
                println("Book Title       : ")
                var bookTitle = readln().toString()
                println("Date Borrowed    : ")
                var dateborrowed = readln().toString()
                println("Date Returned    : ")
                var datereturned = readln().toString()

                booklists.add("$bookTitle")
                student_borrow.remove("$firstName $lastName")
                student_borrow.remove("$bookTitle")
                dateBorrowed.remove("$dateborrowed")
                println(student_borrow)
//                        student_borrow.remove("$firstName $lastName |   $booktitle    |   $dateborrowed")

                break
                select++

            } else if (options.toInt() == 7)
                println("Thank You")

            break

        }while (select <= 6)

    }while (select <= 6)
}