package lesson_14

import kotlin.math.PI
import kotlin.math.pow

fun main() {

    val differentFiguresList: List<Figure> = listOf(
        FigureRound(color = FigureColor.BLACK, radius = 15.3),
        FigureRound(FigureColor.BLACK, 3.14),
        FigureRound(FigureColor.WHITE, 3.488),

        FigureRectangle(color = FigureColor.WHITE, height = 3.1, width = 5.312),
        FigureRectangle(FigureColor.BLACK, 8.39, 1.3),
        FigureRectangle(FigureColor.WHITE, 6.23, 9.64)
    )

    var blackFigurePerimeterSum = 0.0
    var whiteFigureAreaSum = 0.0

    differentFiguresList.forEach {
        when (it.color) {
            FigureColor.BLACK -> blackFigurePerimeterSum += it.calculatePerimeter()
            FigureColor.WHITE -> whiteFigureAreaSum += it.calculateArea()
            else -> println("Цвет из иных миров")
        }
    }

    println(String.format("Сумма периметров всех чёрных фигур: %.2f\nСумма площадей всех белых фигур: %.2f",
        blackFigurePerimeterSum, whiteFigureAreaSum))

}

abstract class Figure(
    val color: FigureColor,
) {
    abstract fun calculateArea() : Double
    abstract fun calculatePerimeter() : Double
}

class FigureRound(
    color: FigureColor,
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
    color: FigureColor,
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

enum class FigureColor {
    WHITE,
    BLACK
}