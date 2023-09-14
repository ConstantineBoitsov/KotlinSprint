package lesson_1_10.lesson_9

fun main() {

    var printedIngredients: String
    var ingredientsList: List<String>

//    АААААА РЕГУЛЯРНЫЕ ВЫРАЖЕНИЯ
//    val ingredientsList: List<String> = listOf(*printedIngredients.split("\\s*,\\s*".toRegex()).toTypedArray())

    do {
        print("Введите 5 ингредиентов блюда через запятую: ")
        printedIngredients = readln()
        ingredientsList = listOf(*printedIngredients.split(", ").toTypedArray())

        if (ingredientsList.size == REQUIRED_LIST_SIZE) {
            val sortedList = ingredientsList.sorted().joinToString(", ")
            println("Список ингредиентов по алфавиту: $sortedList")
        } else {
            println("Некорректный ввод")
        }

    } while (ingredientsList.size != REQUIRED_LIST_SIZE)

}

const val REQUIRED_LIST_SIZE = 5