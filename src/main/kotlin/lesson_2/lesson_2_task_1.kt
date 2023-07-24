package lesson_2

fun main() {

    val grades = listOf(3, 4, 3, 5)

    val sumOfGrades = (grades.sum()).toFloat()

    print(String.format("Средний балл по английскому языку для класса: %.2f", sumOfGrades / grades.size))

}