fun main(){

val myList2 = mutableMapOf<Int, String>() //mutable
val stocks = mutableMapOf<Int, Int>()

myList2.put(myList2.count()+1,"Apple")
myList2.put(myList2.count()+1,"Avocado")
myList2.put(myList2.count()+1,"Orange")
myList2.put(myList2.count()+1,"Banana")
myList2.put(myList2.count()+1,"Kiwi")

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
    print("Enter Option: ")
    var itemnumber: Int = readln().toInt()
    var counter: Int = itemnumber

    do {
        if (itemnumber == 1) {
            println("- Available Items -")
            for (myList2Value in myList2)
                println(myList2Value)
            break
            counter++

        } else if(itemnumber == 2) {
            println("Please enter new item")
            var addItem: String = readln()
            var addIndexToMyList2 = myList2.size+1
            println("You added '$addItem' to the Item List")
            myList2.put(addIndexToMyList2+1,"$addItem")
            break
            counter++

        } else if (itemnumber == 3) {
            println("Please enter item number you want to remove")
            println(myList2)
            println()
            var removedItem = myList2.remove(readln().toInt())
            println("You removed $removedItem to the Item List")

            break
            counter++

        } else if (itemnumber == 4) {
            println("Please enter item number you want check")
            println(stocks)

            break
            counter++

        } else if (itemnumber == 5){
            println("Thank you")
            counter++
        }


    }while (counter <= 5)

}while (counter <= 5)
}