package lesson_17

fun main() {

    val package1 = Package(id = 111, _currentLocation = "Moscow")

    println("${package1.currentLocation}, счётчик перемещений: ${package1.movementCounter}")

    package1.currentLocation = "Saint-Petersburg"
    println("${package1.currentLocation}, счётчик перемещений: ${package1.movementCounter}")

}

class Package(private val id: Int, _currentLocation: String) {

    var movementCounter = 0
    var currentLocation = _currentLocation
        set(value) {
            movementCounter++
            field = value
        }

}