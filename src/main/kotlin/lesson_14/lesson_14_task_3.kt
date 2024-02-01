package lesson_14

import kotlin.math.PI
import kotlin.math.pow

fun main() {

    val differentFiguresList: List<Figure> = listOf(
        FigureRound(color = "black", radius = 15.3),
        FigureRound("black", 3.14),
        FigureRound("white", 3.488),

        FigureRectangle(color = "white", height = 3.1, width = 5.312),
        FigureRectangle("black", 8.39, 1.3),
        FigureRectangle("white", 6.23, 9.64)
    )

    var blackFigurePerimeterSum = 0.0
    var whiteFigureAreaSum = 0.0

    differentFiguresList.forEach {
        if (it.color == "black") blackFigurePerimeterSum += it.calculatePerimeter()
        else whiteFigureAreaSum += it.calculateArea()
    }

    println(String.format("Сумма периметров всех чёрных фигур: %.2f\nСумма площадей всех белых фигур: %.2f",
        blackFigurePerimeterSum, whiteFigureAreaSum))

}

abstract class Figure(
    val color: String,
) {
    abstract fun calculateArea() : Double
    abstract fun calculatePerimeter() : Double
}

class FigureRound(
    color: String,
    val radius: Double,
) : Figure(color) {

    override fun calculateArea() : Double {
        return PI * radius.pow(2.0)
    }

    override fun calculatePerimeter() : Double {
        return 2 * PI * radius
    }

}

class FigureRectangle(
    color: String,
    val height: Double,
    val width: Double,
) : Figure(color) {

    override fun calculateArea(): Double {
        return height * width
    }

    override fun calculatePerimeter(): Double {
        return (height + width) * 2
    }

}