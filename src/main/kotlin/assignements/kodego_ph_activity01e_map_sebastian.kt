package assignements

fun main() {
//  ACTIVITY 01 - E
//    Identify 3 uses cases that will efficiently use an Array, ArrayList, Set, Map.


//    Use of Map.
//CASE 1  - SHOW LISTS OF ITEMS
    println("------------ USE OF MAP - ------|")
    var setOne = setOf<String>("ABC","CDE","EFG","HIJ","KLM","NOP","QRS")

    for (data in setOne){
        println(data)
    }
    println()



//CASE 2  - COMPARE SIMILARITIES
    println("------------ USE OF SET - COMPARE SIMILARITIES------|")
    var setA = setOf<String>("ABC","CDE","EFG","HIJ","KLM","NOP","QRS")
    var setB = setOf<String>("EFG","NOP","TUV","WXYZ","AAAA","BBBB",)

    //INTERSECTION - COMPARE
    println("------------ WITH THE SAME VALUE------|")
    println(setA.intersect(setB))
    println()

    //UNION
    println("------------ COMBINE VALUE------|")
    println(setA.union(setB))
    println()


//CASE 3 - SHOW UNIQUE VALUES FROM TWO SETS
    println("------------ UNIQUE VALUES------|")
    println("These are values not found on setB")
    println(setA.minus(setB)) // Displays Unique Values from setA not in setB
    println()
    println("These are values not found on setA")
    println(setB.minus(setA)) // Displays Unique Values from setB not in setA
    println("----------------------------------------------|")

//CASE 4 - MUTABLE SETOF - ADDING REMOVING VALUES ON SET
    var setC = mutableSetOf<String>("ABC","CDE","EFG","HIJ","KLM","NOP","QRS","TUV","WXYZ")
    var addItem: String = readln()
    setC.add(addItem)

    println(setC)


}




//
//    books.add("Harry Potter")
//    books.add("Math 101")
//    books.add("English 101")
//    books.add("Accounting 101")
//    println(books)
//    println()
//    println("----------------------------------------------|")
//    println()
//    println("Please enter new book:")
//    var addItem: String = readln()
//    books.add(addItem)
//
//    println()
//    println("----------------------------------------------|")
//    println()
//    println("Please see updated list:")
//    println(books)
//    println()
//    println("------------ END OF CASE 1 -----------|")
//
////CASE 2  - SHOW LISTS OF ITEMS
//    println("------------ ARRAY LIST USE - SHOWING LISTS ------|")
//
//
//
//
