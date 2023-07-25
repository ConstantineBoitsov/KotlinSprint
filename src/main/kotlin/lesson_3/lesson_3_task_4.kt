package lesson_3

fun main() {

    var fromX = 'E' // char, чтобы применять арифметику
    var fromY = 2

    var toX = 'E'
    var toY = 4

    var turnCounter = 0

    println("$fromX$fromY-$toX$toY;${++turnCounter}")

    fromX = 'D'
    fromY = 2

    toX = fromX
    toY = fromY + 1

    print("$fromX$fromY-$toX$toY;${++turnCounter}")

}