package lesson_19

fun main() {

    val tShirt = Product(name = "Розовая футболка", id = 123, category = ProductCategory.CLOTHES)
    val blackPen = Product("Чёрная ручка", 42, ProductCategory.STATIONERY)
    val stickerPack = Product("Набор наклеек", 241, ProductCategory.OTHERS)

    tShirt.typeProductInfo()
    blackPen.typeProductInfo()
    stickerPack.typeProductInfo()

}

enum class ProductCategory {
    CLOTHES,
    STATIONERY,
    OTHERS
}

class Product(
    private val name: String,
    private val id: Int,
    private val category: ProductCategory,
) {
    fun typeProductInfo() {
        println("Товар №$id\nНазвание: $name\nКатегория: ${getCategory()}\n")
    }

    private fun getCategory(): String = when(category) {
        ProductCategory.CLOTHES -> "Одежда"
        ProductCategory.STATIONERY -> "Канцелярия"
        else -> "Разное"
    }
}