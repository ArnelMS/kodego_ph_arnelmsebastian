package assignements

fun main() {
//ACTIVITY 01 - D
//Create an application that will accept 5 monetary amounts.
//After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
//The total of the 5  input will be divided by the answer in the second question input.
//Note: Error checking must be done.

    println("----------------------------------------------|")
    println("Please Enter amount: ")

    print("Amount 1: ")
    var amount1: Double = readln().toDouble()
    print("Amount 2: ")
    var amount2: Double = readln().toDouble()
    print("Amount 3: ")
    var amount3: Double = readln().toDouble()
    print("Amount 4: ")
    var amount4: Double = readln().toDouble()
    print("Amount 5: ")
    var amount5: Double = readln().toDouble()


    var subTotal: Double = amount1+amount2+amount3+amount4+amount5
    println("SubTotal: $subTotal")
    println()
    println("----------------------------------------------|")
    println("Divide the value by how many? ")
    var divisor: Int = readln().toInt()
    var dividend: Double = subTotal/divisor
    println("Dividend is $dividend")

    println("----------------------------------------------|")
    println("- End of Code -")

}
