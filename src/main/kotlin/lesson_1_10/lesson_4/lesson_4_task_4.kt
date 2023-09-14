package lesson_1_10.lesson_4

fun main() {

    val dayOfTraining = 5

    println("""
        Упражнения для рук:     ${isOdd(dayOfTraining)}
        Упражнения для ног:     ${!isOdd(dayOfTraining)} 
        Упражнения для спины:   ${!isOdd(dayOfTraining)}
        Упражнения для пресса:  ${isOdd(dayOfTraining)}
    """.trimIndent())

}

fun isOdd(number: Int): Boolean {
    return (number % 2 == 1)
}