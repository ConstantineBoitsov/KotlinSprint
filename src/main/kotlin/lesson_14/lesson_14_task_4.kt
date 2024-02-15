package lesson_14

fun main() {

    val planetTerra = Planet(
        name = "Терра",
        presenceOfAtmosphere = true,
        isLandable = true,
        satelliteList = listOf(
            Satellite(name = "Деймос", presenceOfAtmosphere = false, isLandable = true),
            Satellite(name = "Фобос", presenceOfAtmosphere = true, isLandable = true),
        )
    )

    print("Название планеты: ${planetTerra.name}.\n" +
            "Её спутники: ${planetTerra.satelliteList.joinToString(separator = ", ", postfix = ".") {it.name} }")

}

abstract class CelestialBody(
    val name: String,
    val presenceOfAtmosphere: Boolean,
    val isLandable: Boolean,
)

class Planet(
    name: String,
    presenceOfAtmosphere: Boolean,
    isLandable: Boolean,
    val satelliteList: List<Satellite>,
) : CelestialBody(name, presenceOfAtmosphere, isLandable)

class Satellite(
    name: String,
    presenceOfAtmosphere: Boolean,
    isLandable: Boolean,
) : CelestialBody(name, presenceOfAtmosphere, isLandable)