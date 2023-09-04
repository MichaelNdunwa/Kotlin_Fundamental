package section_10_collections

fun main() {
    val number = listOf("one", "two", "three", "four", "five")
    val numbersLongerThanThree = number.filter { it.length > 3 }
    //println(numbersLongerThanThree)

    val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5)
    val filterNumbersMap = numbersMap.filter { it.key.endsWith("o") && it.value < 4 }
    //println(filterNumbersMap)

    val filteredIndex = number.filterIndexed { index, value -> (index != 0) && (value.length < 5) }
    //println(filteredIndex)

    val filteredNot = number.filterNot { it.length <= 3 }
    //println(filteredNot)

    listOf(1, 2, 3, 'A', 'B', 'C', "Hello World", "Alex", false, true, 2 == 2, 3 == 2, 3 != 2)
        .filterIsInstance<Boolean>()
        .forEach {
            //println(it)
        }

    // Partitions:
    val (match, rest) = number.partition { it.length > 3 }
    println("""
        $match
        $rest
    """.trimIndent())
}