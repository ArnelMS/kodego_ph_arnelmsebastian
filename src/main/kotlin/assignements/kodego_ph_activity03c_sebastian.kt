fun main(){
//  ACTIVITY 03 - C
//  Covered Topic(s) : Functions
//  Instructions :
//  1. Create an ArrayList of grocery products with 20 entries.
//  2. Create a HashMap called Cart.
//  Hint:  Hashmap<String, Int>
//  2. Create a function "addToCart" that will accept a String and an Int,
//      then it will add the input in the Hashmap. If the Entry already exists,
//      create a new entry in the HashMap.
//      Hint : you may add a "_01", "_02"
//      Example Coke_01, Coke_02
//  3. Create a function "checkOut". This will compute how many items have
//      been checked out.
//  4. Create a function "removefromCart"  that will accept a String and
//      remove the input from the Hashmap. If there are multiple entries,
//      remove all from the HashMap.

    var groceryList = ArrayList<String>()
    var cart : HashMap<String, Int> = HashMap<String,Int>()
    var listOfGrocery = listOf<String>("Apple",
        "Banana",        "Baygon",        "Bread",        "Butter",        "Cheese",        "Eggs",
        "Flour",        "Garlic",        "Joy",        "Lettuce",        "Oil",        "Onions",
        "Pasta",        "Rice",        "Soy Sauce",        "Vinegar",        "Fish",
        "Pork",        "Beef")
    groceryList.addAll(listOfGrocery)

    println(addToCart("String", 0))

    cart.put("Avocado", 10)

}

fun addToCart(addGroceryHashMap: String, i: Int) {
    println("Add Items to Cart")
    var addToCartEntry = readln()
    println("-------------------------------------")
    println(addGroceryHashMap)

}
