package lesson_4

fun main() {

    val reservedTablesToday = TOTAL_NUMBER_OF_TABLES
    val reservedTablesTomorrow = TOTAL_NUMBER_OF_TABLES - 4

    println("Доступность столиков на сегодня: ${TOTAL_NUMBER_OF_TABLES - reservedTablesToday != 0}")
    println("Доступность столиков на завтра: ${TOTAL_NUMBER_OF_TABLES - reservedTablesTomorrow != 0}")

}

const val TOTAL_NUMBER_OF_TABLES = 13