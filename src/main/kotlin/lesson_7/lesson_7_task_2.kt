package lesson_7

fun main() {

    var verificationCode = (1000..9999).random()
    println("Ваш код авторизации: $verificationCode")

    print("\nВведите полученный код: ")
    var typedCode = readln().toInt()

    while (typedCode != verificationCode) {
        verificationCode = (1000..9999).random()
        print(
            """
                
            Код введён неверно.
            
            Ваш новый код авторизации: $verificationCode
            
            Введите полученный код: """.trimIndent()
        )
        typedCode = readln().toInt()
    }

    print("\nДобро пожаловать!")

}