package lesson_14

fun main() {

    val linerShip = LinerShip(speed = 40, carryingCapacity = 100, maxPassengers = 100)
    val cargoShip = CargoShip(speed = 30, carryingCapacity = 500, maxPassengers = linerShip.maxPassengers)
    val icebreakerShip = IcebreakerShip(speed = 30, carryingCapacity = linerShip.carryingCapacity,
        maxPassengers = 50, iceBreaking = true)

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
) : LinerShip(speed, carryingCapacity, maxPassengers)

class IcebreakerShip(
    speed: Int,
    carryingCapacity: Int,
    maxPassengers: Int,
    iceBreaking: Boolean,
) : LinerShip(speed, carryingCapacity, maxPassengers, iceBreaking = true)