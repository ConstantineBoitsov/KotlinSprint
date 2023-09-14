package lesson_1_10.lesson_10

fun main() {

    print("Какой длины пароль сгенерировать? ")
    val passwordLength = readln().toInt()

    println("Пароль: ${generatePassword(passwordLength)}")

}

fun generatePassword(length: Int): String {

    var passwordLength = length
    var generatedPassword = ""

    while (passwordLength > 0) {
        generatedPassword += ('0'..'9').random()
        passwordLength--
        if (passwordLength-- > 0) generatedPassword += (' '..'/').random()
    }

    return generatedPassword

}