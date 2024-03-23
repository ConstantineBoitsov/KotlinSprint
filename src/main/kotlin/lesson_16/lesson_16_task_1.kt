package lesson_16

fun main() {

    val dice1 = Dice()

    println(dice1.getRollResult())

}

class Dice {

    private val rollResult = (1..6).random()

    fun getRollResult() = rollResult

}