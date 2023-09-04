package object_oriented_programming

fun main() {
    val person1 = Person("Michael", "Ndunwa", 22)
    val person2 = Person("Michael", "Ndunwa", 22)
    val person3 = Person("Alex", "Dobbin", 23)

    println("Structural Equality: ${person1 == person2}")
    println("Referential Equality: ${person1 === person2}")

    println(person3)
    println(person2)
}

class Person(var firstName: String, var lastName: String, var age: Int): Any() {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other is Person) {
            return this.firstName == other.firstName
                    && this.lastName == other.lastName
                    && this.age == other.age
        }
        return false
    }

    override fun toString(): String {
        return "Person(firstName = '$firstName', lastName = '$lastName, and age = '$age')"
    }
}