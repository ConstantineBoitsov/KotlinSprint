package lesson_5

import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {

    val currentYear = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy"))
    val currentYearInt = currentYear.toInt()

    print("Введите год вашего рождения: ")
    val userYearOfBirth = readln().toInt()

    if (currentYearInt - userYearOfBirth >= AGE_OF_MAJORITY) {
        print("* показать экран с закрытым контентом *")
    } else {
        print("А-та-та!")
    }

}

const val AGE_OF_MAJORITY = 18