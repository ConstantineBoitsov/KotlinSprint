package lesson_9

fun main() {

    val theFunPowderRecipeList: List<String> =
        listOf("сироп вишнёвый", "смешное слово", "шоколадка", "две шутки", "загадка")

    println("В рецепте есть следующие ингредиенты:")
    theFunPowderRecipeList.forEach {
        println(it)
    }

}