package lesson_6

import kotlin.system.exitProcess

fun main() {

    val randomNumber = (1..9).random()
    var triesCounter = 5
    var tryToGuess: Int

    println("*** Текстовая ролевая игра «Угадай число»! ***\n")

    while (triesCounter > 0) {
        print("Угадай число от 1 до 9! Попыток: ${triesCounter--} \n -> ")
        tryToGuess = readln().toInt()
        if (tryToGuess == randomNumber) {
            print("Это была великолепная игра!")
            exitProcess(0)
        } else print("Неверно...\n\n")
    }

    print("Увы, было загадано число $randomNumber. Прими свою участь!")

}