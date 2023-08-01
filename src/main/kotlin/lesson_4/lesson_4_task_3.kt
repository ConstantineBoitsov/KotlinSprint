package lesson_4

fun main() {

    val isWeatherSunny = true
    val isTentOpen = true
    val airHumidity = 20
    val currentSeason = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(isWeatherSunny == SUNNY_WEATHER) and
            (isTentOpen == OPEN_TENT) and (airHumidity == REQUIRED_AIR_HUMIDITY) and
            (currentSeason != FORBIDDEN_SEASON)}")

}

const val SUNNY_WEATHER = true
const val OPEN_TENT = true
const val REQUIRED_AIR_HUMIDITY = 20
const val FORBIDDEN_SEASON = "зима"