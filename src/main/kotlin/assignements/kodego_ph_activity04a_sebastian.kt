fun main(){

//    ACTIVIT 04 - A
//    Covered Topic(s) : Classes
//    Instructions :
//    1. Use class to represent the student rather string.Make sure the student
//      has a firstName, lastName, nickName, id and year enrolled
//    2. Update the searchStudentWildSearch to search for the wild string in the
//      lastname, middle name, and firstname.  Return the Arraylist of students
//      that match the searched string, if there are no entries return an empty ArrayList.
//    3. Add a function searchStudentWildSearch that will accept a string and
//      either of the following values, lastname, middlename, nickname. This will
//      search the specific wild string depending where it was mentioned to be
//      searched for. Return the Arraylist of students that match the searched string,
//      if there are no entries return an empty ArrayList.

    var student = StudentClass("Arnel", "Sebastian", "Boying", 20220001, 2022)
//    var studentWildSearch : student.searchStudentWildSearch()
    println(student.firstname)
    println(student.lastname)
    println(student.nickname)
    println(student.idNumber)
    println(student.yearEnrolled)
    println(student.searchStudentWildSearch())


}

class StudentClass (var firstname: String,var lastname: String, var nickname: String, var idNumber: Int, var yearEnrolled:Int) {



    fun searchStudentWildSearch(){

    }

}