package lesson_6

import kotlin.system.exitProcess

fun main() {

    println(
        """
        Здравствуйте!
        
        Перед тем, как использовать приложение, докажите, что вы — не робот.""".trimIndent()
    )

    var numberOfTries = 3

    loop@ while (numberOfTries > 0) {
        val firstRandomNumber = (1..9).random()
        val secondRandomNumber = (1..9).random()
        print("Решите простую задачу: $firstRandomNumber + $secondRandomNumber = ")
        if (readln().toInt() == (firstRandomNumber + secondRandomNumber)) {
            break@loop
        } else println("Неверно.")
        numberOfTries--
    }

    if (numberOfTries == 0) {
        println("В доступе отказано.")
        exitProcess(0)
    }

    print(
        """
            
        Добро пожаловать на страницу регистрации! Придумайте себе логин и пароль.
        
        Логин: """.trimIndent()
    )
    val registeredLogin = readln()

    print("Пароль: ")
    val registeredPassword = readln()

    print(
        """
        Регистрация прошла успешно!
        
        Для авторизации введите логин и пароль. 
        
        Логин: """.trimIndent()
    )

    var typedLogin = readln()
    while (typedLogin != registeredLogin) {
        print(
            """
            Такой логин не найден.
            
            Логин: """.trimIndent()
        )
        typedLogin = readln()
    }

    print("Пароль: ")
    var typedPassword = readln()
    while (typedPassword != registeredPassword) {
        print(
            """
            Неверный пароль.
            
            Пароль: 
        """.trimIndent()
        )
        typedPassword = readln()
    }

    print("Авторизация прошла успешно!")

}