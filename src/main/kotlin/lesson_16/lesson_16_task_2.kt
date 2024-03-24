package lesson_16

import kotlin.math.pow

fun main() {

    val circle = Circle(15.2)

    println("Длина окружности: ${circle.circleLength()}\nПлощадь окружности: ${circle.circleSquare()}")

}

class Circle(

    private val radius: Double,

) {

    private val numberPi = 3.14

    fun circleLength() = numberPi * radius.pow(2.0)

    fun circleSquare() = 2 * numberPi * radius

}