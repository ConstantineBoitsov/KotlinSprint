package lesson_17

fun main() {

    val ship = Ship("Lenochka", 40, "Innsmouth")

    ship.name = "Mushroom"

}

class Ship(_name: String, _averageSpeed: Int, _homePort: String) {

    var name = _name
        set(value) {
            println("Error. Нельзя менять имя корабля!")
        }

}