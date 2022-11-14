fun main() {

    var books = ArrayList<String>()
    var listOfNames = listOf(
        "1984",
        "Dune",
        "Fallen",
        "Goldfinger",
        "Jaws",
        "MockingJay",
        "Unwind",
        "Charlotte's Web",
        "Adventures of Tom Sawyer",
        "Phantom Tollbooth",
        "A Bear Called Paddington",
        "Magic Treehouse",
        "Stuart Little",
        "Velveteen Rabbit",
        "Harry Potter",
        "Game of Thrones",
        "Little Prince",
        "The Giving Tree",
        "Black Beauty",
        "Little Women"
    )
    books.addAll(listOfNames)

    var searchBookWildSearch = ArrayList<String>()
    var studentExistBookWildSearch = ArrayList<String>()

    var functionsMenu = mutableMapOf<Int, String>()
    functionsMenu.put(1, "isBookInRecord")
    functionsMenu.put(2, "addBook")
    functionsMenu.put(3, "removeBook")
    functionsMenu.put(4, "countBooks")
    functionsMenu.put(5, "searchBookWildSearch")
    functionsMenu.put(6, "searchBookName")
    functionsMenu.put(7, "showBooks")
    functionsMenu.put(8, "Exit")


    do {
        println()
        println("------FUNCTIONS------")
        println("Function [1] isBookInRecord")
        println("Function [2] addBook")
        println("Function [3] removeBook")
        println("Function [4] countBooks")
        println("Function [5] searchBookWildSearch")
        println("Function [6] searchBookName")
        println("Function [7] showBooks")
        println("EXIT     [8] ")
        println()
        println()
        print("Enter Option: ")
        var itemNumber: Int = readln().toInt()
        var counter: Int = itemNumber
        do {
            if (itemNumber == 1) {
                println(isBookInRecord(books))
                break
                counter++

            } else if (itemNumber == 2) {
                println(addBook(books))
                break
                counter++

            } else if (itemNumber == 3) {
                println(removeBook(books))

                break
                counter++

            } else if (itemNumber == 4) {
                println(countBooks(books))
                break
                counter++

            } else if (itemNumber == 5) {
                println(searchBookWildSearch(books, searchBookWildSearch, studentExistBookWildSearch))
                break
                counter++

            } else if (itemNumber == 6) {
                println(searchBookName(books, searchBookWildSearch, studentExistBookWildSearch))
                break
                counter++

            } else if (itemNumber == 7) {
                println(showBooks(books, searchBookWildSearch, studentExistBookWildSearch))
                break
                counter++

            } else (itemNumber == 8)
                println("Thank you")
                counter = 100+1

        } while (counter <= 100)


    } while (counter <= 100)
}
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    fun isBookInRecord( nameArray: ArrayList<String>) {
        println("Check book title if in record")
        print("Enter Book title: ")
        var bookEntered = readln()
        println("---------------------------------------------------|")

        var isBookInRecord = nameArray.contains(bookEntered)
        if (isBookInRecord == true) {
            println("$isBookInRecord | Title of book found in record")
        } else if (isBookInRecord == false) {
            println("False: | Book title NOT found!")
        }
        println("---------------------------------------------------|")
        println("End of function isBookInRecord")
        println()

        return
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    fun addBook( nameArray: ArrayList<String>) {
        println("** ADD A BOOK **")
        print("Enter book title: ")
        var bookEntered = readln()
        nameArray.add(bookEntered).toString()
        println("---------------------------------------------------|")
        println("Book added on record!")
        println("---------------------------------------------------|")
        println("End of function addStudent")
        println()

        return

    }
    fun removeBook(nameArray: ArrayList<String>) {
        println("** REMOVE BOOK **")
        print("Enter book title: ")
        var bookEntered = readln()
        var ifNameEnteredInRecord = nameArray.contains(bookEntered)
        if (ifNameEnteredInRecord == false) {
            println("---------------------------------------------------|")
            println("Name does not exist!")
            println("---------------------------------------------------|")
        } else if (ifNameEnteredInRecord == true) {
            println("---------------------------------------------------|")
            println("Name removed!")
            nameArray.remove(bookEntered).toString()
            println("---------------------------------------------------|")
            println("End of function addStudent")
            return
        }
    }
    fun countBooks(nameArray: ArrayList<String>) {
        println("---------------------------------------------------|")
        println("Numbers of books on record")
        println("${nameArray.size} books found")
        println("---------------------------------------------------|")
        println("End of function countStudent")

    }
    fun searchBookWildSearch(nameArray: ArrayList<String>, searchArray : ArrayList<String>, existArray : ArrayList<String>) {
        println("Check for Student - Wild Search")
        print("Enter book title: ")
        var bookEntered = readln()
        println("---------------------------------------------------|")
        var ifNameInRecord = nameArray.contains(bookEntered)
        if (ifNameInRecord == true) {
            searchArray.add(bookEntered)
            println("Book found on record!")
            println()
            println("Book Wild Search:")
            var ctr: Int = 0
            while (ctr < searchArray.size){
                println(searchArray[ctr])

                ctr++

            }
            println()

        }else if (ifNameInRecord == false) {
            println("False: | Book title NOT found!")
            println("---------------------------------------------------|")
    //        searchArray.add(nameEntered)
            println()
            println("Student Wild Search:")
            var ctr: Int = 0
            while (ctr < searchArray.size) {
                println(searchArray[ctr])

                ctr++
                println()
            }

        }
        println("---------------------------------------------------|")
        println("End of function isStudentInRecord")
        println()

        return


    }
    fun searchBookName(nameArray: ArrayList<String>, searchArray : ArrayList<String>, existArray : ArrayList<String>) {
        println("Search book title if in record")
        print("Enter Book title: ")
        var bookEntered = readln()
        println("---------------------------------------------------|")
        println("Book Found! Book Title: $bookEntered")
        println("---------------------------------------------------|")
        var searchBookName = nameArray.contains(bookEntered)
        if (searchBookName == true) {
            var ctr1: Int = 0
            while (ctr1 < nameArray.size) {
                println(nameArray[ctr1])

                ctr1++
            }

        } else if (searchBookName == false) {
            println("Book title NOT found!")
        }
        println("---------------------------------------------------|")
        println("End of function isBookInRecord")
        println()

        return

    }
    fun showBooks(nameArray: ArrayList<String>, searchArray : ArrayList<String>, existArray : ArrayList<String>) {
        println("Showing all entries in the ArrayList")
        println("---------------------------------------------------|")
        println("List of Books")
        var ctr1: Int = 0
        while (ctr1 < nameArray.size) {
            println(nameArray[ctr1])

            ctr1++
        }
        println("---------------------------------------------------|")
        println("List of books in Wild Search")
        var ctr2: Int = 0
        while (ctr2 < searchArray.size) {
            println(searchArray[ctr2])

            ctr2++
        }
        println("---------------------------------------------------|")
        println("End of function showStudents")
    }



// ACTIVITY 03 - B
// Covered Topic(s) : Functions
// Instructions :
// 1. Create an ArrayList of bookname with 20 entries.
// 2. Create a function "isBookInRecord" that will accept a String and
//      return true if the book is found, otherwise false.
// 3. Create a function "addBook" that will accept a String and add it to the ArrayList.
// 4. Create a function "removeBook"  that will accept a name and remove it
//      from the ArrayList if it exactly matches the book name.
// 5. Create a function "countBooks" that will return the size of the ArrayList.
// 6. Create a function "searchBookWildSearch" that will accept a String and search
//      if that string is found with in the ArrayList, it will return an ArrayList of books that matched if there are.
// 7. Create a function  "searchBookName" that will accept a String and search if
//      there is an exact match of the String input, it will return an ArrayList of books that matched if there are.
// 8.  Create a function "showBooks" that will print all the entries in the ArrayList.

