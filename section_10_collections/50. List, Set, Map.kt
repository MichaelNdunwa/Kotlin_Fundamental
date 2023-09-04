package section_10_collections

fun main() {
    // Sets:
    val person1 = Person("Michael")
    val person2 = Person("Ndunwa")
    val person3 = Person("Chidera")
    val person4 = Person("Joy")
    val person5 = Person("Joshua")
    val person6 = Person("Chima")
    val person7 = Person("Henry")
    val person8 = Person("Henry")
    val names = mutableSetOf(person1, person2, person3, person4, person5, person6, person7, person8)
    //names.forEach { println(it.name) }

    // Maps:
    val groceries = mutableMapOf(100 to "Okpa", 50 to "Groundnuts", 120 to "Garri", 50 to "Sugar", 55 to "Fufu")
    groceries[60] = "kreams Biscuits"
    groceries.remove(55)
    groceries.forEach { (price, item) ->
        println("$item is sold for ₦${price}")
    }
}

class Person(val name: String)