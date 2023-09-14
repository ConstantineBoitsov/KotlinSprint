package lesson_1_10.lesson_7

fun main() {

    do {
        val verificationCode = (1000..9999).random()
        println("\nВаш код авторизации: $verificationCode")

        print("\nВведите полученный код: ")
        val typedCode = readln().toInt()
    } while (typedCode != verificationCode)

    print("\nДобро пожаловать!")

}