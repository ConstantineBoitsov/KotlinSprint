package lesson_1_10.lesson_7

fun main() {

    val charPool: List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')

    print("Введите длину пароля, который надо сгенерировать: ")
    val passwordLength = readln().toInt()

    var generatedPassword = ""

    repeat(passwordLength) {
        generatedPassword += charPool.random()
    }

    print(generatedPassword)

}