package lesson_8

fun main() {

    val theFunPowderRecipe = arrayOf("сироп вишнёвый", "смешное слово", "шоколадка", "две шутки", "загадка")

    println("Ингредиенты весёлого порошка: ${theFunPowderRecipe.joinToString(", ", "", ".")}")

    print("Какой ингредиент вы хотели бы заменить? ")
    var ingredientToSwap = readln()

    while (ingredientToSwap !in theFunPowderRecipe) {
        print(
            """
            Такого ингредиента нет, попробуйте ещё раз. """.trimIndent()
        )
        ingredientToSwap = readln()
    }

    print("На что его заменить? ")
    theFunPowderRecipe[theFunPowderRecipe.indexOf(ingredientToSwap)] = readln()

    println(
        """
        Успешно!
        Ингредиенты весёлого порошка: ${theFunPowderRecipe.joinToString(", ", "", ".")}""".trimIndent()
    )

}