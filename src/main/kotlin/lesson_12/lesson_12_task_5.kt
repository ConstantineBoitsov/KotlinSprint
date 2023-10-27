package lesson_12

import kotlin.random.Random

fun main() {

    val daysInMonthMutableList: MutableList<WeatherConditionsUltimateEdition> = mutableListOf()

    repeat(MONTH_LENGTH) {
        daysInMonthMutableList.add(
            WeatherConditionsUltimateEdition(
                (MIN_TEMPERATURE_VALUE..MAX_TEMPERATURE_VALUE).random(),
                (MIN_TEMPERATURE_VALUE..MAX_TEMPERATURE_VALUE).random(),
                Random.nextBoolean()
            )
        )
    }

    val dayTemperaturesMutableList: MutableList<Int> = mutableListOf()
    val nightTemperaturesMutableList: MutableList<Int> = mutableListOf()
    daysInMonthMutableList.forEach {
        dayTemperaturesMutableList.add(it.dayTemperature)
        nightTemperaturesMutableList.add(it.nightTemperature)
    }
    val precipitationList = daysInMonthMutableList.filter { it.precipitationDuringTheDay }

    val averageDayTemperature = dayTemperaturesMutableList.average().toInt()
    val averageNightTemperature = nightTemperaturesMutableList.average().toInt()
    val numberOfDaysWithPrecipitation = precipitationList.size

    println(
        """
        Среднее значение дневных температур: $averageDayTemperature
        Среднее значение ночных температур: $averageNightTemperature
        Количество дней с осадками: $numberOfDaysWithPrecipitation
    """.trimIndent()
    )

}

class WeatherConditionsUltimateEdition(
    _dayTemperature: Int,
    _nightTemperature: Int,
    _precipitationDuringTheDay: Boolean,
) {

    val dayTemperature: Int = _dayTemperature
    val nightTemperature: Int = _nightTemperature
    val precipitationDuringTheDay: Boolean = _precipitationDuringTheDay

}

const val MONTH_LENGTH = 30
const val MIN_TEMPERATURE_VALUE = -25
const val MAX_TEMPERATURE_VALUE = 45