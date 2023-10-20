package lesson_12

fun main() {

    val weatherCon1 = WeatherConditions()
    val weatherCon2 = WeatherConditions()

    weatherCon1.dayTemperature = 16
    weatherCon1.nightTemperature = 6
    weatherCon1.precipitationDuringTheDay = false

    weatherCon2.dayTemperature = 25
    weatherCon2.nightTemperature = 14
    weatherCon2.precipitationDuringTheDay = true

    weatherCon1.printConditions()
    weatherCon2.printConditions()

}

class WeatherConditions() {

    var dayTemperature = 0
    var nightTemperature = 0
    var precipitationDuringTheDay = false

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