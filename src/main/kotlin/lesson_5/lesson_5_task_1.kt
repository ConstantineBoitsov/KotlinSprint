package lesson_5

fun main() {

    val firstRandom = (1..50).random()
    val secondRandom = (1..50).random()
    print("Чтобы доказать, что вы не робот, решите простую задачу: " +
            "$firstRandom + $secondRandom = ")
    val sumOfRandoms = readln().toInt()

    if (sumOfRandoms == firstRandom + secondRandom) {
        print("Добро пожаловать!")
    } else {
        print("Доступ запрещён!")
    }

}