package lesson_9

fun main() {

    val funPowderRecipe: MutableList<String> = mutableListOf("сироп вишнёвый", "смешное слово", "шоколадка")

    println("В рецепте есть базовые ингредиенты: ${funPowderRecipe.joinToString("\n", "\n")}")

    print("Желаете добавить ещё? ")
    val desireToAdd = readln()
    if (desireToAdd.equals("да", true)) {
        print("Какой ингредиент вы хотите добавить? ")
        funPowderRecipe.add(readln())
    } else return

    println("\nТеперь в рецепте есть следующие ингредиенты: ${funPowderRecipe.joinToString("\n", "\n")}")

}