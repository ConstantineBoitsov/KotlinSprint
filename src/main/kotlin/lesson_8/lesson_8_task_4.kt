package lesson_8

fun main() {

    val theFunPowderRecipe = arrayOf("сироп вишнёвый", "смешное слово", "шоколадка", "две шутки", "загадка")

    println("Ингредиенты весёлого порошка: ${theFunPowderRecipe.joinToString(", ", "", ".")}")

    print("Какой ингредиент вы хотели бы заменить? ")
    var ingredientToSwap: String

    do {
        ingredientToSwap = readln()
    } while (ingredientToSwap !in theFunPowderRecipe)

//    print("Какой ингредиент вы хотели бы зменить? ")
//    var ingredientToSwap = readln()

//    while (ingredientToSwap !in theFunPowderRecipe) {
//        print("Такого ингредиента нет, попробуйте ещё раз. ")
//        ingredientToSwap = readln()
//    }

    print("На что его заменить? ")
    theFunPowderRecipe[theFunPowderRecipe.indexOf(ingredientToSwap)] = readln()

    println("Готово!\nВы сохранили следующий список: ${theFunPowderRecipe.joinToString(", ", "", ".")}")

}