package lesson_1_10.lesson_3

fun main() {

    var fromX = 'E' // char, чтобы применять арифметику
    var fromY = 2
    var positionStart = fromX.toString() + fromY.toString()

    var toX = 'E'
    var toY = 4
    var positionEnd = toX.toString() + toY.toString()

    var turnCounter = 0

    println("$positionStart-$positionEnd;${++turnCounter}")

    fromX = 'D'
    fromY = 2
    positionStart = fromX.toString() + fromY.toString()

    toX = fromX
    toY = fromY + 1
    positionEnd = toX.toString() + toY.toString()

    print("$positionStart-$positionEnd;${++turnCounter}")

}