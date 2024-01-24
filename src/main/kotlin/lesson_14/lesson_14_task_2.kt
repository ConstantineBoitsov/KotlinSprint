package lesson_14

fun main() {

    val linerSuperShip = LinerSuperShip(speed = 40, carryingCapacity = 100, maxPassengers = 100)
    val cargoSuperShip = CargoSuperShip(speed = 30, carryingCapacity = 500, maxPassengers = linerSuperShip.maxPassengers)
    val icebreakerSuperShip = IcebreakerSuperShip(speed = 30, carryingCapacity = linerSuperShip.carryingCapacity,
        maxPassengers = 50, iceBreaking = true)

    linerSuperShip.printShipProperties()
    linerSuperShip.loading()
    println()
    cargoSuperShip.printShipProperties()
    cargoSuperShip.loading()
    println()
    icebreakerSuperShip.printShipProperties()
    icebreakerSuperShip.loading()

}

open class LinerSuperShip(
    val speed: Int,
    val carryingCapacity: Int,
    val maxPassengers: Int,
    val iceBreaking: Boolean = false,
) {

    open fun loading() {
        println("ПОГРУЗКА *лайнер выдвигает горизонтальный трап со шкафута*")
    }

    fun printShipProperties() {
        when(javaClass.simpleName) {
            "LinerSuperShip" -> println("Лайнер")
            "CargoSuperShip" -> println("Грузовой корабль")
            "IcebreakerSuperShip" -> println("Ледокол")
            else -> println("НЛО")
        }
        println("Скорость: $speed\nГрузоподъёмность: $carryingCapacity\nПассажиров вмещается: " +
                "$maxPassengers\nВозможность колоть лёд: $iceBreaking")
    }

}

class CargoSuperShip(
    speed: Int,
    carryingCapacity: Int,
    maxPassengers: Int,
) : LinerSuperShip(speed, carryingCapacity, maxPassengers) {

    override fun loading() {
        println("ПОГРУЗКА *грузовой корабль активирует погрузочный кран*")
    }

}

class IcebreakerSuperShip(
    speed: Int,
    carryingCapacity: Int,
    maxPassengers: Int,
    iceBreaking: Boolean,
) : LinerSuperShip(speed, carryingCapacity, maxPassengers, iceBreaking = true) {

    override fun loading() {
        println("ПОГРУЗКА *ледокол открывает ворота со стороны кормы*")
    }

}