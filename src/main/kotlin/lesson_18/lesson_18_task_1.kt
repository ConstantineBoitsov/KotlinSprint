package lesson_18

fun main() {

    val eShopOrder1 = EShopOrder()
    val eShopOrder2 = EShopOrder()

    eShopOrder1.typeInfo(productName = "BFG-9000")
    eShopOrder2.typeInfo(productNameList = listOf("Shovel", "Pickaxe"))

}

class EShopOrder {

    fun typeInfo(productName: String) {
        println("Заказан товар: $productName")
    }

    fun typeInfo(productNameList: List<String>) {
        println("Заказаны товары: $productNameList")
    }

}