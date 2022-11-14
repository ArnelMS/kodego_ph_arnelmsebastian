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
    var listOfNames = listOf("Robert","John","Michael","David","William","Richard","Joseph","Thomas","Charles","Olivia","Emma","Charlotte","Amelia","Avery","Sophia","Isabella","Mia","Evelyn","Harper","Jane")
    names.addAll(listOfNames)
    println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|")
    println(names)
    println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|")
    println(isStudentInRecord(names))
//    val getName = names.get(nameEntered).toString()


}

fun isStudentInRecord( nameArray: ArrayList<String>) {
    println("Check name if in record")
    print("Enter Name: ")
    var nameEntered = readln()
    println("---------------------------------------------------|")
    var ifNameInRecord = nameArray.contains(nameEntered)
     if (ifNameInRecord == true) {
        println("This is $ifNameInRecord: Name of Student found in Record")
    }else if (ifNameInRecord == false) {
        println("Name of Student is NOT in Record")
    }
    println("---------------------------------------------------|")
    println("End of function isStudentInRecord")
    println()

}
