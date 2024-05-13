package lesson_19

fun main() {

    val mothershipZeta = SpaceShip("Zeta")
    mothershipZeta.toLand()

}

class SpaceShip(
    val name: String,
) {

    fun toTakeOff() {
        println("Двигатели включены!")
        // TODO: Нужна информация о дополнительной логике!
    }

    fun toLand() {
        TODO("Напишите тут что-нибудь...")
    }

    fun shootAnAsteroid() {
        // TODO: Требуется описание орудий!
    }

}