package lesson_1_10.lesson_4

fun main() {

    print("Наличие повреждений корпуса: (true/false) ")
    val shipCondition: Boolean = readln().toBoolean()
    print("Текущий состав экипажа: ")
    val shipCrew: Int = readln().toInt()
    print("Количество ящиков с провизией на борту: ")
    val shipProvision: Int = readln().toInt()
    print("Благоприятность метеоусловий: (true/false) ")
    val weatherCondition: Boolean = readln().toBoolean()

    if (shipProvision > PROVISION_CRATES_MIN) {
        if (shipCondition == REQUIRED_SHIP_DAMAGE) {
            if ((SHIP_CREW_MIN <= shipCrew) and (shipCrew <= SHIP_CREW_MAX)) {
                print("Корабль может приступить к плаванию")
            } else {
                print("Корабль не может приступить к плаванию")
            }
        } else if (shipCrew == SHIP_CREW_MAX) {
            if (weatherCondition == GOOD_WEATHER_CONDITION) {
                print("Корабль может приступить к плаванию")
            } else {
                print("Корабль не может приступить к плаванию")
            }
        } else {
            print("Корабль не может приступить к плаванию")
        }
    } else {
        print("Корабль не может приступить к плаванию")
    }

}

const val REQUIRED_SHIP_DAMAGE = false
const val SHIP_CREW_MIN = 55
const val SHIP_CREW_MAX = 70
const val PROVISION_CRATES_MIN = 50
const val GOOD_WEATHER_CONDITION = true