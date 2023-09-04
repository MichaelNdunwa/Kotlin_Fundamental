package section_10_collections

fun main() {
    val listOfNumbers = listOf("one", "two", "three", "four", "five", "six")
    //println(listOfNumbers.elementAt(3))
    //println(listOfNumbers.first())
    //println(listOfNumbers.last())

    println(listOfNumbers.first { it.length > 3 })
    println(listOfNumbers.last { it.startsWith("f") })
}