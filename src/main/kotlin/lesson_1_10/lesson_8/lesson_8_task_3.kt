package lesson_1_10.lesson_8

fun main() {

    val theFunPowderReceipt = arrayOf("сироп вишнёвый", "смешное слово", "шоколадка", "две шутки", "загадка")

    print("Какой ингредиент весёлого порошка вы хотите найти? ")
    val searchedIngredient = readln()

    if (searchedIngredient in theFunPowderReceipt) {
        print("Ингредиент $searchedIngredient в рецепте есть!")
    } else {
        print("Такого ингредиента в рецепте нет.")
    }

}