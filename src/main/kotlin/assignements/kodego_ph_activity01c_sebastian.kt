fun main(){
//  ACTIVITY 01 - C
//  You are tasked to automate an inventory system for a grocery.
//  Identify the items that can be bought in a grocery store.
//  After listing the different items, identify the characteristics of the items.
//  You are also tasked to group the items in categories to help manage the grocery.  Use the proper data types.



    var item1: String = "Apple"
    var category1: String = "Fruits"
    var price1: Double = 50.00
    var quantity1: Int = 10
    var available1: Char = 'Y'

    var item2: String = "Toothpaste"
    var category2: String = "Toiletries"
    var price2: Double = 100.00
    var quantity2: Int = 5
    var available2: Char = 'Y'

    var item3: String = "Pork Chop"
    var category3: String = "Meat/Fish"
    var price3: Double = 300.00
    var quantity3: Int = 10
    var available3: Char = 'Y'

    var item4: String = "Baygon"
    var category4: String = "Non-Food"
    var price4: Double = 180.00
    var quantity4: Int = 3
    var available4: Char = 'Y'

    var item5: String = "Lettuce"
    var category5: String = "Vegetables"
    var price5: Double = 50.00
    var quantity5: Int = 10
    var available5: Char = 'Y'

    println("------------------------------------------------------|")
    println("** Available items **")
    println("$item1")
    println("$item2")
    println("$item3")
    println("$item4")
    println("$item5")
    println("------------------------------------------------------|")

    println("Please enter item name for complete details:")
    var itemName: String = readln()
//    println("Item Name: $itemName")

    if (itemName == item1) {
        println("Item:      $item1")
        println("category:  $category1")
        println("Price:     $price1")
        println("Quantity:  $quantity1")
        println("Available: $available1")
    }

    if (itemName == item2) {
        println("Item:      $item2")
        println("category:  $category2")
        println("Price:     $price2")
        println("Quantity:  $quantity2")
        println("Available: $available2")
    }

    if (itemName == item3) {
        println("Item:      $item3")
        println("category:  $category3")
        println("Price:     $price3")
        println("Quantity:  $quantity3")
        println("Available: $available3")
    }

    if (itemName == item4) {
        println("Item:      $item4")
        println("category:  $category4")
        println("Price:     $price4")
        println("Quantity:  $quantity4")
        println("Available: $available4")
    }

    if (itemName == item5) {
        println("Item:      $item5")
        println("category:  $category5")
        println("Price:     $price5")
        println("Quantity:  $quantity5")
        println("Available: $available5")
    }
    println("------------------------------------------------------|")
    println()
    println()
    println("** Please see list of categories **")
    println("$category1")
    println("$category2")
    println("$category3")
    println("$category4")
    println("$category5")

    println("Please enter a category to see available item:")
    var categories: String = readln()
    println("------------------------------------------------------|")

    if (categories == category1) {
        println("category:  $category1")
        println("Item:      $item1")
    }

    if (categories == category2) {
        println("category:  $category2")
        println("Item:      $item2")
    }

    if (categories == category3) {
        println("category:  $category3")
        println("Item:      $item3")
    }

    if (categories == category4) {
        println("category:  $category4")
        println("Item:      $item4")
    }

    if (categories == category5) {
        println("category:  $category5")
        println("Item:      $item5")
    }
    println("------------------------------------------------------|")
    println("- End of Code -")

}