package lesson_16

import kotlin.math.pow

fun main() {

    val circle = Circle(15.2)

    println("Длина окружности: ${circle.circleLength()}\nПлощадь окружности: ${circle.circleSquare()}")

}

class Circle(

    private val radius: Double,

) {

    fun circleLength() = NUMBER_PI * radius.pow(2.0)

    fun circleSquare() = 2 * NUMBER_PI * radius

}

private const val NUMBER_PI = 3.14