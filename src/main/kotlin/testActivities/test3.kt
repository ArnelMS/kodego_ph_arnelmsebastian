fun main() {

    var numbers = arrayListOf<Int>()
    var input: Int = 1
    var ctr: Int = 1

    while (input > 0) {
        println("Please Enter number: ")
        input = readln().toInt()
        if (input > 0)
            numbers.add(input)
        ctr++
    }

    println(MaxNumber(numbers))
}

fun MaxNumber(numberArray:ArrayList<Int>):Int{
    var largest: Int = numberArray[0]

    for (num in numberArray) {
        if (num > largest)
            largest = num
    }
    return largest
}