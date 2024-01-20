package lesson_14

fun main() {

    val linerShip = LinerShip(40, 100, 100)
    val cargoShip = CargoShip(30, 500, linerShip.maxPassengers)
    val icebreakerShip = IcebreakerShip(30, linerShip.carryingCapacity, 50, iceBreaking = true)

}

open class LinerShip(
    val speed: Int,
    val carryingCapacity: Int,
    val maxPassengers: Int,
    val iceBreaking: Boolean = false,
)

class CargoShip(
    speed: Int,
    carryingCapacity: Int,
    maxPassengers: Int,
) : LinerShip(speed, carryingCapacity, maxPassengers) {

}

class IcebreakerShip(
    speed: Int,
    carryingCapacity: Int,
    maxPassengers: Int,
    iceBreaking: Boolean,
) : LinerShip(speed, carryingCapacity, maxPassengers, iceBreaking = true) {

}