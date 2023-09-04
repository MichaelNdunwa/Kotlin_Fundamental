package object_oriented_programming

// The real world serves as a model to write object oriented programming code

class Cars constructor(
    name: String,
    var model: String,
    var color: String,
    var doors: Int
) {

    var name = name.trim()

    fun move() {
        println("The car $name is moving")
    }

    fun stop() = println("The car $name has stopped")
}

class Calculator    {
    companion object {
        var changeNumber = 0
        fun sum(a: Int, b: Int) = a + b
    }
}

object Database {
    init {
        println("Database created, i wish i know what am doing.")
    }
}

class User constructor(
    firstName: String,
    var lastName: String = "",
    var age: Int = 0
) {
    init {
        println("User: $firstName was created.")
    }
}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 40);

    fun printData() {
        println("Direction = $direction and Distance = $distance")
    }
}

class ListView(val items: Array<String>) {
    inner class ListViewItem {
        fun displayItem(position: Int) {
            println(items[position])
        }
    }
}