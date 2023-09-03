package lesson_9

fun main() {

    var omeletteIngredientsAmountList: List<Int> = listOf(2, 50, 15)

    print("Сколько порций омлета вы хотите приготовить? ")
    val numberOfServings = readln().toInt()

    omeletteIngredientsAmountList = omeletteIngredientsAmountList.map { it * numberOfServings }

    print(
        "На $numberOfServings порций вам понадобится: Яиц - ${omeletteIngredientsAmountList[0]}," +
                " молока - ${omeletteIngredientsAmountList[1]}, " +
                "сливочного масла - ${omeletteIngredientsAmountList[2]}"
    )

}