package lesson_1_10.lesson_4

fun main() {

    val firstCargoWeigh = 20
    val firstCargoVolume = 80

    val secondCargoWeigh = 50
    val secondCargoVolume = 100

    println("Груз с весом $firstCargoWeigh кг и объёмом $firstCargoVolume " +
            "соответствует категории 'Average': ${(firstCargoWeigh >= AVERAGE_WEIGH_MIN) and
                    (firstCargoWeigh <= AVERAGE_WEIGH_MAX) and (firstCargoVolume < AVERAGE_VOLUME_MAX)}")
    println("Груз с весом $secondCargoWeigh кг и объёмом $secondCargoVolume " +
            "соответствует категории 'Average': ${(secondCargoWeigh >= AVERAGE_WEIGH_MIN) and
                    (secondCargoWeigh <= AVERAGE_WEIGH_MAX) and (secondCargoVolume < AVERAGE_VOLUME_MAX)}")

}

const val AVERAGE_WEIGH_MIN = 35
const val AVERAGE_WEIGH_MAX = 100
const val AVERAGE_VOLUME_MAX = 100