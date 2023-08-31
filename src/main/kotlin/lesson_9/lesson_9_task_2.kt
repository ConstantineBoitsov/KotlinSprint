package lesson_9

fun main() {

    val funPowderRecipeList: MutableList<String> = mutableListOf("сироп вишнёвый", "смешное слово", "шоколадка")

    println("В рецепте есть базовые ингредиенты: ${funPowderRecipeList.joinToString("\n", "\n")}")

    print("Желаете добавить ещё? ")
    val desireToAdd = readln()
    if (desireToAdd.equals("да", true)) {
        print("Какой ингредиент вы хотите добавить? ")
        funPowderRecipeList.add(readln())
    } else return

    println("\nТеперь в рецепте есть следующие ингредиенты: ${funPowderRecipeList.joinToString("\n", "\n")}")

}