fun main(){

    var arrayOne = ArrayList<Int>()
    var arrayOneReversed = ArrayList<Int>()

    print("Enter number 1: ")
    var number1: Int = readln().toInt()
    arrayOne.add(number1)

    print("Enter number 2: ")
    var number2: Int = readln().toInt()
    arrayOne.add(number2)

    print("Enter number 3: ")
    var number3: Int = readln().toInt()
    arrayOne.add(number3)

    print("Enter number 4: ")
    var number4: Int = readln().toInt()
    arrayOne.add(number4)

    print("Enter number 5: ")
    var number5: Int = readln().toInt()
    arrayOne.add(number5)

    arrayOneReversed.add(number5)
    arrayOneReversed.add(number4)
    arrayOneReversed.add(number3)
    arrayOneReversed.add(number2)
    arrayOneReversed.add(number1)

    println(arrayOne)
    println(arrayOneReversed)

}


