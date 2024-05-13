package lesson_19

fun main() {

    val tShirt = Product(name = "Розовая футболка", id = 123, category = ProductCategory.CLOTHES)
    val blackPen = Product("Чёрная ручка", 42, ProductCategory.STATIONERY)
    val stickersPack = Product("Набор наклеек", 241, ProductCategory.OTHERS)

    tShirt.typeProductInfo()
    blackPen.typeProductInfo()
    stickersPack.typeProductInfo()

}

enum class ProductCategory {
    CLOTHES {
        override fun getCategory(): String {
            return "Одежда"
        }
    },
    STATIONERY {
        override fun getCategory(): String {
            return "Канцелярские товары"
        }
    },
    OTHERS {
        override fun getCategory(): String {
            return "Разное"
        }
    };

    abstract fun getCategory(): String
}

class Product(
    private val name: String,
    private val id: Int,
    private val category: ProductCategory,
) {
    fun typeProductInfo() {
        println("Товар №$id\nНазвание: $name\nКатегория: ${category.getCategory()}\n")
    }
}