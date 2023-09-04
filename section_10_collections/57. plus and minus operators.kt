package section_10_collections

fun main() {
    val listOfNames = listOf("Michael", "Ndunwa", "Chidera", "Amos", "Joy")
    val plusList = listOfNames + "Happiness"
    val minusList = listOfNames - listOf("Michael", "Ndunwa")
    println(plusList)
    println(minusList)
}