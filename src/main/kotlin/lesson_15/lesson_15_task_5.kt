package lesson_15

fun main() {

    val truck1 = HeavyCar(serialNumber = 1234, currentPassengersAmount = 1, currentCargoWeight = 1)
    val truck2 = HeavyCar(serialNumber = 213, currentPassengersAmount = 3, currentCargoWeight = 2)
    val truck3 = HeavyCar(serialNumber = 73, currentPassengersAmount = 1, currentCargoWeight = 1)

    val car1 = LightCar(serialNumber = 42, currentPassengersAmount = 3)
    val car2 = LightCar(serialNumber = 1, currentPassengersAmount = 5)
    val car3 = LightCar(serialNumber = 4, currentPassengersAmount = 1)

    truck1.move()
    truck2.move()
    truck3.move()
    car1.move()
    car2.move()
    car3.move()

}

abstract class Vehicle(

    val serialNumber: Int,

) : Movable

interface Movable {

    fun move() {
        println("Едет")
    }

}

interface TransportationOfPassengers {

    val currentPassengersAmount: Int
    val maxPassengersAmount: Int

}

interface TransportationOfCargo {

    val currentCargoWeight: Int
    val maxCargoWeight: Int

}

class HeavyCar(

    serialNumber: Int,
    override val currentPassengersAmount: Int,
    override val maxPassengersAmount: Int = 1,
    override val currentCargoWeight: Int,
    override val maxCargoWeight: Int = 2,

    ) : Vehicle(serialNumber), TransportationOfPassengers, TransportationOfCargo {

    override fun move() {
        val movesOrNot: String = if ((currentPassengersAmount <= maxPassengersAmount) and (currentCargoWeight <= maxCargoWeight)) {
            ""
        } else "не "
        println("Грузовой автомобиль №$serialNumber ${movesOrNot}едет")
    }
}

class LightCar(

    serialNumber: Int,
    override val currentPassengersAmount: Int,
    override val maxPassengersAmount: Int = 3,

    ) : Vehicle(serialNumber), TransportationOfPassengers {

    override fun move() {
        val movesOrNot: String = if (currentPassengersAmount <= maxPassengersAmount) ""
        else "не "
        println("Легковой автомобиль №$serialNumber ${movesOrNot}едет")
    }

}