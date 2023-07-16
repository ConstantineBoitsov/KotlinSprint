package lesson_1

fun main () {

    val year = 1961
    var hour = "09"
    var minute = "07"

    println("""
        Взлёт:
        $year год
        $hour ч
        $minute мин
    """.trimIndent())

    hour = "10"
    minute = "55"

    print("Время посадки: $hour:$minute")
}