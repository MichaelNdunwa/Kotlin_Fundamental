package section_10_collections

fun main() {
    val numbers = listOf("one", "two", "three", "four", "five")
    println(numbers.any { it.endsWith("e") })
    println(numbers.none { it.endsWith("w") })
    println(numbers.all { it.isEmpty()})
}