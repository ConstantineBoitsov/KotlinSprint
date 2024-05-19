package lesson_20

fun main() {

    val listOfString = listOf(
        "Blah-blah!",
        "Yo-yo!",
        "Meh-meh!",
        "Pee-pee!",
        "Bow-wow!",
    )

    val lambdify: (String) -> Unit = { it: String ->
        println("Нажат элемент «${it}»")
    }

    val listOfLambda: List<(String) -> Unit> = listOfString.map {
        lambdify
    }

    listOfLambda.forEach { it }

//    for (i in 1..<listOfLambda.size step 2) {
//        listOfLambda[i]
//    }

}