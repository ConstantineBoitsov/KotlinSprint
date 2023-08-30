package lesson_9

fun main() {

    val theFunPowderRecipe: List<String> =
        listOf("сироп вишнёвый", "смешное слово", "шоколадка", "две шутки", "загадка")

    println("В рецепте есть следующие ингредиенты:")
    theFunPowderRecipe.forEach {
        println(it)
    }

}