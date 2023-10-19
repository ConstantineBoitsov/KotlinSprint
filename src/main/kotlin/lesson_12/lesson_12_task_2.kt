package lesson_12

fun main() {

    val weatherCon1 = WeatherConditionsAdvanced(
        dayTemperature = 16,
        nightTemperature = 5,
        precipitationDuringTheDay = false,
    )
    val weatherCon2 = WeatherConditionsAdvanced(25, 16, true)

    weatherCon1.printConditions()
    weatherCon2.printConditions()

}

class WeatherConditionsAdvanced(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var precipitationDuringTheDay: Boolean
) {

    fun printConditions() {
        println(
            """
            – дневная температура: $dayTemperature
            – ночная температура: $nightTemperature
            – наличие осадков в течение суток: $precipitationDuringTheDay
            
        """.trimIndent()
        )
    }

}