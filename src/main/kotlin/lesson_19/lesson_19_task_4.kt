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
    private var ammunitionType = AmmunitionType.NO_AMMO

    fun switchAmmunitionType(newAmmunitionType: AmmunitionType) {
        ammunitionType = newAmmunitionType
        println(ammunitionType.getAmmunitionColor())
    }

    fun shoot() {
        if (ammunitionType == AmmunitionType.NO_AMMO) println("*ЩЁЛК* Боезапас пуст!")
        else println("*БАХ* Нанесено ${ammunitionType.damage} единиц урона!")
    }

}

enum class AmmunitionType(val damage: Int) {
    BLUE(5) {
        override fun getAmmunitionColor(): String {
            return "Танк заряжен синими патронами"
        }
    },
    GREEN(10) {
        override fun getAmmunitionColor(): String {
            return "Танк заряжен зелёными патронами"
        }
    },
    RED(20) {
        override fun getAmmunitionColor(): String {
            return "Танк заряжен красными патронами"
        }
    },
    NO_AMMO(0) {
        override fun getAmmunitionColor(): String {
            return "Танк разряжен"
        }
    };

    abstract fun getAmmunitionColor(): String
}