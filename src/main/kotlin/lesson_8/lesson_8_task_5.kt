package lesson_8

fun main() {

    print("Сколько будет ингредиентов? ")
    val ingredientsArray = Array<String>(readln().toInt()) { "" }

    for (i in ingredientsArray.indices) {
        print("Введите ${i + 1} ингредиент: ")
        ingredientsArray[i] = readln()
    }

    print("Список ингредиентов: ${ingredientsArray.joinToString(", ")}.")

}