package section_10_collections

fun main() {
    val names = listOf("Michael", "Ndunwa", "Chidera", "Amos", "Joy")
    println(names.groupBy { it[2].uppercase() })
    println(names.groupBy(keySelector = { it[2] }, valueTransform = { it.uppercase() }))
}