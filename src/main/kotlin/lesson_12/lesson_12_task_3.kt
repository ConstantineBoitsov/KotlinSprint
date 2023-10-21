package lesson_12

fun main() {

    val weatherCon = WeatherConditionsSuperAdvanced(285, 280, true)

    weatherCon.printConditions()

}

class WeatherConditionsSuperAdvanced(
    dayTemperatureKelvinScale: Int,
    nightTemperatureKelvinScale: Int,
    _precipitationDuringTheDay: Boolean
) {

    val dayTemperatureCelsiusScale = dayTemperatureKelvinScale - 273
    val nightTemperatureCelsiusScale = nightTemperatureKelvinScale - 273
    val precipitationDuringTheDay = _precipitationDuringTheDay

    fun printConditions() {
        println(
            """
            – дневная температура: $dayTemperatureCelsiusScale
            – ночная температура: $nightTemperatureCelsiusScale
            – наличие осадков в течение суток: $precipitationDuringTheDay
            
        """.trimIndent()
        )
    }

}