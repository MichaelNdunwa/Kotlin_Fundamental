package section_10_collections

fun main() {
    val arrangeNumbers = listOf(5, 3, 8, 2, 10, 1, 9, 15, 10)
    println(arrangeNumbers.sorted())
    arrangeNumbers.sorted().forEach { println(it) }

    val phones = listOf(
        Phone("Samsung", "A50", 4, 30_000),
        Phone("Techno", "Camon 20", 12, 120_000),
        Phone("Infinix", "Note 30", 8, 118_000)
    )
    phones
}

data class Phone(val brand: String, val name: String, val ram: Int, val price: Int)