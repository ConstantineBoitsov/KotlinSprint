package lesson_2

fun main() {

    var grades = listOf<Int>(3, 4, 3, 5)

    var sumOfGrades = 0f
    grades.forEach {sumOfGrades += it}

    print(String.format("Средний балл по английскому языку для класса: %.2f", sumOfGrades / grades.size))

}