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

    // динамический список имён спутников
    val satelliteNamesMutableList = mutableListOf<String>()
    planetTerra.satelliteList.forEach {
        satelliteNamesMutableList.add(it.name)
    }

    print("Название планеты: ${planetTerra.name}.\n" +
            "Её сспутники: ${satelliteNamesMutableList.joinToString(separator = ", ", postfix = ".")}")

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
) : CelestialBody(name, presenceOfAtmosphere, isLandable) {

}

class Satellite(
    name: String,
    presenceOfAtmosphere: Boolean,
    isLandable: Boolean,
) : CelestialBody(name, presenceOfAtmosphere, isLandable) {

}