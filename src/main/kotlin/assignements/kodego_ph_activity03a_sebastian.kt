fun main() {

// ACTIVITY 03 - A
//  Covered Topic(s) : Functions
//  Instructions :
//  Note: Names are single word with no spaces example, "Marco", "Eugene", "Sarah", "Isaiah", "Anthony", "Henry".
//  1. Create an ArrayList of names with 20 entries.
//  2. Create a function "isStudentInRecord" that will accept a name and return true if the name is found, otherwise false.
//  3. Create a function "addStudent" that will accept a name and add it to the ArrayList.
//  4. Create a function "removeStudent"  that will accept a name and remove it from the ArrayList.
//  5. Create a function "countStudent" that will return the size of the ArrayList.
//  6. Create a function "searchStudentWildSearch" that will accept a String and search if that string is
//     found with in the ArrayList, it will return an ArrayList of names that matched if there are.
//  7. Create a function  "searchStudentName" that will accept a String and search if there is an exact
//     match of the String input, it will return an ArrayList of names that matched if there are.
//  8. Create a function "searchStudent" that will accept a String and call "searchStudentWildSearch" if
//     the String input is less than or equal to three, and it will call "searchStudentName" if the String input is greater than three.
//  9.  Create a function "showStudents" that will print all the entries in the ArrayList.


    var names = ArrayList<String>()
    var searchStudentWildSearch = ArrayList<String>()
    var studentExistWildSearch = ArrayList<String>()

    var functionsMenu = mutableMapOf<Int, String>()
    functionsMenu.put(1, "isStudentInRecord")
    functionsMenu.put(2, "addStudent")
    functionsMenu.put(3, "removeStudent")
    functionsMenu.put(4, "countStudent")
    functionsMenu.put(5, "searchStudentWildSearch")
    functionsMenu.put(6, "searchStudentName")
    functionsMenu.put(7, "searchStudent")
    functionsMenu.put(8, "showStudents")
    functionsMenu.put(9, "Exit")



    var listOfNames = listOf("Robert","John","Michael","David","William","Richard","Joseph",
        "Thomas","Charles","Olivia","Emma","Charlotte","Amelia","Avery","Sophia",
        "Isabella","Mia","Evelyn","Harper","Jane")
    names.addAll(listOfNames)

    do {
        println()
        println("------FUNCTIONS------")
        println("Function [1] isStudentInRecord")
        println("Function [2] addStudent")
        println("Function [3] removeStudent")
        println("Function [4] countStudent")
        println("Function [5] searchStudentWildSearch")
        println("Function [6] searchStudentName")
        println("Function [7] searchStudent")
        println("Function [8] showStudents")
        println("EXIT     [9] ")
        println()
        println()
        print("Enter Option: ")
        var itemNumber: Int = readln().toInt()
        var counter: Int = itemNumber
        do {
            if (itemNumber == 1) {
                println(isStudentInRecord2(names))
                break
                counter++

            } else if (itemNumber == 2) {
                println(addStudent(names))
                break
                counter++

            } else if (itemNumber == 3) {
                println(removeStudent(names))

                break
                counter++

            } else if (itemNumber == 4) {
                println(countStudent(names))
                break
                counter++

            } else if (itemNumber == 5) {
                println(searchStudentWildSearch(names,searchStudentWildSearch,studentExistWildSearch))
                break
                counter++

            } else if (itemNumber == 6) {
                println(searchStudentName(names,searchStudentWildSearch, studentExistWildSearch))
                break
                counter++

            } else if (itemNumber == 7) {
                println(searchStudent())
                break
                counter++
            } else if (itemNumber == 8) {
                println(showStudents(names,searchStudentWildSearch, studentExistWildSearch))
                break
                counter++

            } else if (itemNumber == 9) {
                println("Thank you")
                counter=100+1

            }
        } while (counter <= 100)


    } while (counter <= 100)
}


//    val getName = names.get(nameEntered).toString()

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
fun isStudentInRecord2( nameArray: ArrayList<String>) {
    println("Check name if in record")
    print("Enter Name: ")
    var nameEntered = readln()
    println("---------------------------------------------------|")

    var ifNameInRecord = nameArray.contains(nameEntered)
    if (ifNameInRecord == true) {
        println("$ifNameInRecord | Name of student found in record")
    }else if (ifNameInRecord == false) {
        println("False: | Name of student NOT found")
    }
    println("---------------------------------------------------|")
    println("End of function isStudentInRecord")
    println()

    return

}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
fun addStudent( nameArray: ArrayList<String>) {
    println("Add a student name")
    print("Enter a Name: ")
    var nameEntered = readln()
    nameArray.add(nameEntered).toString()
    println("---------------------------------------------------|")
    println("Name Added!")
    println("---------------------------------------------------|")
    println("End of function addStudent")
    println()

    return

}
fun removeStudent(nameArray: ArrayList<String>) {
    println("Remove student name")
    print("Enter a Name: ")
    var nameEntered = readln()
    var ifNameEnteredInRecord = nameArray.contains(nameEntered)
    if (ifNameEnteredInRecord == false) {
        println("---------------------------------------------------|")
        println("Name does not exist!")
    } else if (ifNameEnteredInRecord == true) {
        println("Name removed!")
        nameArray.remove(nameEntered).toString()
        println("---------------------------------------------------|")
        println("End of function addStudent")
        return
    }
}
fun countStudent(nameArray: ArrayList<String>) {
    println("---------------------------------------------------|")
    println("Numbers of students on record")
    println("${nameArray.size} names found")
    println("---------------------------------------------------|")
    println("End of function countStudent")

}
fun searchStudentWildSearch(nameArray: ArrayList<String>, searchArray : ArrayList<String>, existArray : ArrayList<String>) {
    println("Check for Student - Wild Search")
    print("Enter Name: ")
    var nameEntered = readln()
    println("---------------------------------------------------|")
    var ifNameInRecord = nameArray.contains(nameEntered)
    if (ifNameInRecord == true) {
        searchArray.add(nameEntered)
        println("Name found on record!")
        println()
        println("Student Wild Search:")
        var ctr: Int = 0
        while (ctr < searchArray.size){
            println(searchArray[ctr])

            ctr++

        }
        println()

    }else if (ifNameInRecord == false) {
        println("False: | Name of student NOT found")
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
fun searchStudentName(nameArray: ArrayList<String>, searchArray : ArrayList<String>, existArray : ArrayList<String>) {
    println("Search name of student in record")
    print("Enter student name: ")
    var nameEntered = readln()
    println("---------------------------------------------------|")
    println("Student Name Found! Name of Student: $nameEntered")
    println("---------------------------------------------------|")
    var searchStudentName = nameArray.contains(nameEntered)
    if (searchStudentName == true) {
        var ctr1: Int = 0
        while (ctr1 < nameArray.size) {
            println(nameArray[ctr1])

            ctr1++
        }

    } else if (searchStudentName == false) {
        println("Name of student NOT found!")
    }
    println("---------------------------------------------------|")
    println("End of function isBookInRecord")
    println()

    return

}
fun searchStudent(){
    println("searchStudent")

}
fun showStudents(nameArray: ArrayList<String>, searchArray : ArrayList<String>, existArray : ArrayList<String>) {
    println("Showing all entries in the ArrayList")
    println("---------------------------------------------------|")
    println("List of Names")
    var ctr1: Int = 0
    while (ctr1 < nameArray.size) {
        println(nameArray[ctr1])

        ctr1++
    }
    println("---------------------------------------------------|")
    println("List of Names in Wild Search")
    var ctr2: Int = 0
    while (ctr2 < searchArray.size) {
        println(searchArray[ctr2])

        ctr2++
    }
    println("---------------------------------------------------|")
    println("End of function showStudents")
}