package section_10_collections

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println("The sum is: ${numbers.sum()}")
    println("The count is: ${numbers.count()}")
    println("The average is: ${numbers.average()}")
    println("The min value is: ${numbers.minOrNull()}")
    println("The max value is: ${numbers.maxOrNull()}")
    println("The sum * 3 is: ${numbers.sumOf { it * 3}}")
}