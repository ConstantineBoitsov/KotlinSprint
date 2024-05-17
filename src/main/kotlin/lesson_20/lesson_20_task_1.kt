package lesson_20

fun main() {

    val greetingsWithLambda: (String) -> String = { username: String ->
        "С наступающим Новым Годом, $username!"
    }

    println(greetingsWithLambda("Vasen'ka"))

}