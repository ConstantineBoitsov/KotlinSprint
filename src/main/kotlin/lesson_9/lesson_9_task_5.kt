package lesson_9

fun main() {

    val ingredientsMutableList: MutableList<String> = mutableListOf()
    var typedIngredient: String

    do {
        print("Введите ${ingredientsMutableList.size + 1} ингредиент из 5: ")
        typedIngredient = readln()
        if (typedIngredient !in ingredientsMutableList) {
            ingredientsMutableList.add(typedIngredient)
        } else {
            println("Такой ингредиент уже есть.")
        }
    } while (ingredientsMutableList.size < 5)

    print(ingredientsMutableList.sorted().joinToString(", ", "", ".").replaceFirstChar { it.uppercase() })

}