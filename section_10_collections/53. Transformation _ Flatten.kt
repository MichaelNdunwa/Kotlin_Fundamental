package section_10_collections

fun main() {
    val numbersSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
    /*for (numbers in numbersSets) {
        for (number in numbers) {
            println("$number")
        }
        println("\n")
    }*/

    val numbersFlatten = numbersSets.flatten()
//    println(numbersFlatten[8])
    numbersFlatten.forEach { println(it) }
}