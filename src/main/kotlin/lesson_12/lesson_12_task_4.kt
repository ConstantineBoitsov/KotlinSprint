package lesson_12

fun main() {

    val weatherCon = WeatherConditionsSuperDuperAdvanced(285, 280, true)

}

class WeatherConditionsSuperDuperAdvanced(
    dayTemperatureKelvinScale: Int,
    nightTemperatureKelvinScale: Int,
    _precipitationDuringTheDay: Boolean
) {

    var dayTemperatureCelsiusScale = dayTemperatureKelvinScale - 273
    var nightTemperatureCelsiusScale = nightTemperatureKelvinScale - 273
    var precipitationDuringTheDay = _precipitationDuringTheDay

    init {
        println(
            """
            – дневная температура: $dayTemperatureCelsiusScale
            – ночная температура: $nightTemperatureCelsiusScale
            – наличие осадков в течение суток: $precipitationDuringTheDay
            
        """.trimIndent()
        )
    }

}