fun main() {


//  ACTIVITY 01 - H
//Create an application that will accept 2 Integers.
//It will identify the lower value and bigger value of the two inputs.
//Then, your application will print all the prime numbers starting from the lower number up to the largest number.
//
//Scope :
//String
//Loops
//
//Input:
//1, 4 -> 1, 2, 3
//10 -> 1, 2, 3, 5, 7
    print("Enter First Number: ")
    var integer1: Int = readln().toInt()
    println("$integer1")

    for (i in integer1 until integer1)
        if (integer1 % i == 0)
            println("$i")

    print("Enter Second Number: ")
    var integer2: Int = readln().toInt()
    println("$integer2")

    for (j in integer2 until integer2)
        if (integer2 % j == 0)
            print(j)




}