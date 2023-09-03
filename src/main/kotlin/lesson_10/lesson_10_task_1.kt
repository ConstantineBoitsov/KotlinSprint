package lesson_10

fun main() {

    val humansDice = throwDice()
    println("Игрок бросил кубики, выпало ${humansDice[0]} и ${humansDice[1]}")
    Thread.sleep(1000) // САСПЕНС

    val computersDice = throwDice()
    println("Компьютер бросил кубики, выпало ${computersDice[0]} и ${computersDice[1]}")
    Thread.sleep(1000) // ЕЩЁ САСПЕНС

    when (computersDice.sum() - humansDice.sum()) {
        in -1 downTo -10 -> print("Победило человечество! Цивилизация была возрождена!")
        0 -> print("Ничья! Война человечества и машин продолжается!")
        in 1..10 -> print("Победила машина! Человечество было стёрто с лица земли!")
    }

}

fun throwDice(): List<Int> = listOf((0..6).random(), (0..6).random())