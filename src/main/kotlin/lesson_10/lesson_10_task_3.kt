package lesson_10

fun main() {

    print("Какой длины пароль сгенерировать? ")
    val passwordLength = readln().toInt()

    println("Пароль: ${generatePassword(passwordLength)}")

}

fun generatePassword(length: Int): String {

    val charPool: List<Char> = ('0'..'9') + "!\"#\$%&'()*+,-./ ".toCharArray().toList()
    var generatedPassword = ""

    repeat(times = length) {
        generatedPassword += charPool.random()
    }

    return generatedPassword

}