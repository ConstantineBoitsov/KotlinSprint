package lesson_18

fun main() {

    val screen = Screen()

    val circle = Circle(123, 20)
    val square = Square(213, 42)
    val dot = Dot(42)

    screen.draw(3, 5, circle)
    screen.draw(2.5f, 3.4f, square)
    screen.draw(12.3f, 11.1f, dot)

}

abstract class FigureToDraw(val id: Int)

class Circle(
    id: Int,
    val radius: Int,
    ) : FigureToDraw(id)

class Square(
    id: Int,
    val sideLength: Int,
    ) : FigureToDraw(id)

class Dot(id: Int) : FigureToDraw(id)

class Screen {

    fun draw(x: Int, y: Int, circle: Circle) {
        println("*рисует круг радиуса ${circle.radius} с центром в [$x, $y]*")
    }

    fun draw(x: Float, y: Float, circle: Circle) {
        println("*рисует круг радиуса ${circle.radius} с центром в [$x, $y]*")
    }

    fun draw(x: Int, y: Int, square: Square) {
        println("*рисует квадрат со стороной ${square.sideLength} с центром в [$x, $y]*")
    }

    fun draw(x: Float, y: Float, square: Square) {
        println("*рисует квадрат со стороной ${square.sideLength} с центром в [$x, $y]*")
    }

    fun draw(x: Int, y: Int, dot: Dot) {
        println("*рисует точку в [$x, $y]*")
    }

    fun draw(x: Float, y: Float, dot: Dot) {
        println("*рисует точку в [$x, $y]*")
    }

}