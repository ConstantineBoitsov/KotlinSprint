package lesson_8

fun main() {

    val theFunPowderReceipt = arrayOf("сироп вишнёвый", "смешное слово", "шоколадка", "две шутки", "загадка")

    print("Какой ингредиент весёлого порошка вы хотите найти? ")
    val searchedIngredient = readln()

    for (ingredient in theFunPowderReceipt) {
        if (ingredient == searchedIngredient) {
            print("Ингредиент $ingredient в рецепте есть!")
            return
        }
    }
    print("Такого ингредиента в рецепте нет.")

}