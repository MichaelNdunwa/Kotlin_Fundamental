package section_10_collections

fun main() {
    val numbers = mutableListOf(1, 2, 3, 3, 4, 5, 6)
    println(searchElement(3, numbers))
}

fun searchElement(elementToSearch: Int, numbers: MutableList<Int>): Int {
    var low = 0; var high = numbers.size - 1

    var i = 0
    while (low <= high) {
        ++i
        println("Searched number: $i")
        val mid = (low + high) / 2
        val cmp = numbers[mid].compareTo(elementToSearch)

        if (cmp < 0) {
            low = mid + 1
        }
        else if (cmp > 0) {
            low = mid - 1
        }
        else {
            return numbers[mid]
        }
    }
    return -1
}