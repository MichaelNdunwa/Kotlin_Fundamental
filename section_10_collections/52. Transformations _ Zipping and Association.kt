package section_10_collections

fun main() {
    // Zipping:
    val colours = listOf("black", "white", "yellow")
    val animals = listOf("horse", "rat", "bird")
    val coloursOfAnimals = colours.zip(animals)
    //println(colours.zip(animals) {colours, animals -> "The ${animals.replaceFirstChar {it.uppercase()}} is $colours in colour."})

    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    //println(numberPairs)
    //println(numberPairs[2])
    //println(numberPairs.unzip())


    val numbers = listOf("one", "two", "three", "four")
    println(numbers.associateWith { it.length })
    println(numbers.associateBy { it.first().uppercase() })
    println(numbers.associateBy ( keySelector = {it.first().uppercase()}, valueTransform = {it.length}))
}