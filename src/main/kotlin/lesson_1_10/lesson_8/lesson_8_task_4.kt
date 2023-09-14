package lesson_1_10.lesson_8

fun main() {

    val theFunPowderRecipe = arrayOf("сироп вишнёвый", "смешное слово", "шоколадка", "две шутки", "загадка")

    println("Ингредиенты весёлого порошка: ${theFunPowderRecipe.joinToString(", ", "", ".")}")

    var ingredientToSwap: String

    do {
        print("Какой ингредиент вы хотели бы заменить? ")
        ingredientToSwap = readln()

        if (ingredientToSwap in theFunPowderRecipe) {
            print("На что его заменить? ")
            theFunPowderRecipe[theFunPowderRecipe.indexOf(ingredientToSwap)] = readln()
            println(
                "Готово!\nВы сохранили следующий список: " +
                        theFunPowderRecipe.joinToString(", ", "", ".")
            )
            return
        } else {
            println("Такого ингредиента нет, попробуйте ещё раз.")
        }
    } while (ingredientToSwap !in theFunPowderRecipe)

}