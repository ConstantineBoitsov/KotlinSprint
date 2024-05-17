package lesson_19

fun main() {

    val bestTankEver = Tank("The Nagibator")

    bestTankEver.shoot()

    bestTankEver.switchAmmunitionType(AmmunitionType.BLUE)
    bestTankEver.shoot()

    bestTankEver.switchAmmunitionType(AmmunitionType.GREEN)
    bestTankEver.shoot()

    bestTankEver.switchAmmunitionType(AmmunitionType.RED)
    bestTankEver.shoot()

}

class Tank(
    val name: String,
) {
    private var ammunitionType: AmmunitionType? = null

    fun switchAmmunitionType(newAmmunitionType: AmmunitionType) {
        ammunitionType = newAmmunitionType
        println(getAmmunitionColor())
    }

    fun shoot() {
        if (ammunitionType == null) println("*ЩЁЛК* Боезапас пуст!")
        else println("*БАХ* Нанесено ${ammunitionType?.damage} единиц урона!")
    }

    private fun getAmmunitionColor (): String = when(ammunitionType) {
        AmmunitionType.BLUE -> "Танк заряжен синими патронами"
        AmmunitionType.GREEN -> "Танк заряжен зелёными патронами"
        AmmunitionType.RED -> "Танк заряжен красными патронами"
        else -> "Танк разряжен"
    }

}

enum class AmmunitionType(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}