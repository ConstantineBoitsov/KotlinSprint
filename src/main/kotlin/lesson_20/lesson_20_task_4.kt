package lesson_20

fun main() {

    val listOfString = listOf(
        "Blah-blah!",
        "Yo-yo!",
        "Meh-meh!",
        "Pee-pee!",
        "Bow-wow!",
    )

    val lambdify = { it: String ->
        { println("Нажат элемент «${it}»") }
    }

    val listOfLambda = listOfString.map {
        lambdify(it)
    }

    listOfLambda.forEachIndexed { index, function ->
        if ((index + 1) % 2 == 0) {
            function.invoke()
        }
    }

}