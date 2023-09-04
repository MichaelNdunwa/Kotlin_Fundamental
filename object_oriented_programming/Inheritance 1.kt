package object_oriented_programming

fun main() {
    val car = Car("BMW", "RED", 1, 4)
    val plane = Plane("Boeing", "WHITE and BLUE", 4, 8)

    car.move()
    car.stop()

    plane.move()
    plane.stop()
}

open class Vehicle(val name: String, val color: String) {
    open fun move() = println("$name is moving.")
    open fun stop() = println("$name has stopped.")
}

class Car(name: String, color: String, val engines: Int, val doors: Int) : Vehicle(name, color) {

}

class Plane(name: String, color: String, val engines: Int, val doors: Int) : Vehicle(name, color) {
    fun stopFlying() = println("$name has stopped flying.")
    fun flying() = println("$name is flying.")
    override fun move() = flying()
    override fun stop() = stopFlying()
}