package lesson_18

abstract class OrderBox {

    abstract fun calculateSurfaceArea(): Int

}

class RectangleBox(
    private val edgeLength: Int,
    private val edgeWidth: Int,
    private val edgeHeight: Int,
) : OrderBox() {
    override fun calculateSurfaceArea(): Int =
        2 * (edgeHeight * edgeLength + edgeHeight * edgeWidth + edgeWidth * edgeLength)
}

class CubicBox(
    private val edgeLength: Int,
) : OrderBox() {
    override fun calculateSurfaceArea(): Int = edgeLength * edgeLength * 6
}