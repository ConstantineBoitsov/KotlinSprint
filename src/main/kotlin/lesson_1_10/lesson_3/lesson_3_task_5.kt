package lesson_1_10.lesson_3

fun main() {

    val turnLog = "D2-D4;0"

    val parts = turnLog.split("-", ";") // [D2, D4, 0]

//    val figureCoordinates = parts[0].split("") // [, D, 2, -, D, 4, ]

//    val fromX = figureCoordinates[1]
//    val fromY = figureCoordinates[2]
//
//    val toX = figureCoordinates[4]
//    val toY = figureCoordinates[5]

    val positionStart = parts[0]
    val positionEnd = parts[1]
    val turnCounter = parts[2]

    print("""
        Начальное положение фигуры: $positionStart
        Конечное положение фигуры: $positionEnd
        Номер хода: $turnCounter
    """.trimIndent())

}