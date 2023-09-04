package section_10_collections

fun main() {
    val names = listOf("Michael", "Ndunwa", "Chidera", "Amos", "Joy", "Success")
    println(names.slice(1..3))
    println(names.slice(0..4 step 2))
    println(names.slice(setOf(3, 5, 0)))

    println("\n take and drop")
    println(names.take(3))
    println(names.takeLast(3))
    println(names.drop(1))
    println(names.dropLast(5))

    println("\nwhile:")
    println(names.takeWhile { !it.startsWith("J") })
    println(names.takeLastWhile { it != "Chidera" })
    println(names.dropWhile { it.length == 3 })
    println(names.dropLastWhile { it.contains("o")})

    println("\nChunked")
    val numbers = (0..12).toList()
    println(numbers.chunked(3))
    println(numbers.chunked(3) { it.sum() })

    println("\nwindowed function:")
    val numbersStrings = listOf("one", "two", "three", "four", "five", "six")
    println(numbersStrings.windowed(3))
   // println(numbersStrings.windowed(3) { })

    println("\nLearning Windowed Function from chatGPT:")
    val numberList = (1..10).toList()
    println(numberList.windowed(size = 3, step = 2))
}