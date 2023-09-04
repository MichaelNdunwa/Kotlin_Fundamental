package section_10_collections

fun main() {
    val numbersStrings = listOf("one", "two", "three", "four")
    //println(numbersStrings)
    //println(numbersStrings.joinToString())

    val listString = StringBuffer("The list of numbers are: ")
    println(numbersStrings.joinTo(listString))
//    println(numbersStrings.joinTo(separator = " | ", prefix = "start: ", postfix = ":end"))

    val numbers = (1..100).toList()
    println(numbers.joinToString(limit = 20, truncated = "...."))

    println(numbersStrings.joinToString { "Elements: ${it.uppercase()}" })
}