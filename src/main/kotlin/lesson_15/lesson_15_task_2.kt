package lesson_15

fun main() {

    val weatherServer = WeatherServer()

    val temperatureTest = Temperature(15)
    val precipitationAmountTest = PrecipitationAmount(60)

    weatherServer.weatherReport(temperatureTest)
    weatherServer.weatherReport(precipitationAmountTest)

}

abstract class WeatherStationStats(
    val value: Int,
)

class Temperature(
    value: Int,
) : WeatherStationStats(value)

class PrecipitationAmount(
    value: Int,
) : WeatherStationStats(value)

class WeatherServer {

    fun weatherReport(stats: WeatherStationStats) {
        when(stats) {
            is Temperature -> println("Sending «Температура: ${stats.value}°C»\nSuccess!")
            is PrecipitationAmount -> println("Sending «Количество осадков: ${stats.value} мм»\nSuccess!")
        }
    }

}