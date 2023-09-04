package section_10_collections

fun main() {
    val itemInStudio = setOf("Chair", "Table", "Fan")
    val items = itemInStudio.map {it + "s"}
    //println(items)

    val numbers = setOf(1, 2, 3, 4, 5, 6, 7)
    //println(numbers.map { if (it == 3) it * 100 else it })
    println(numbers.mapIndexedNotNull { index, value -> if (index == 0) null else index * value})

/*
    val groceries = mapOf(100 to "Okpa", 50 to "Groundnuts", 120 to "Garri", 50 to "Sugar", 55 to "Fufu")
    println(groceries.mapValues { it.value + "s"})
    println(groceries.mapKeys { it.key.toDouble()})
*/

    val numbersMap = mapOf("Key 1" to 1, "Key 2" to 2, "Key 3" to 3, "Key 4" to 4)
//    println(numbersMap.mapKeys {it.key.uppercase()})
//    println(numbersMap.mapValues { it.value.plus(it.key.length)})
}