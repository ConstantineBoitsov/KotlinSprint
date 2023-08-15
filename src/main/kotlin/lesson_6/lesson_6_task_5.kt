package lesson_6

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
        return
    }

    print(
        """
            
        Добро пожаловать на страницу регистрации! Придумайте себе логин и пароль.
        
        Логин: """.trimIndent()
    )
    val registeredLogin = readln()

    print("Пароль: ")
    val registeredPassword = readln()

    println("\nРегистрация прошла успешно!\n")

    print(
        """
        Для авторизации введите логин и пароль. 
        
        Логин: """.trimIndent()
    )

    var typedLogin = readln()

    print("Пароль: ")
    var typedPassword = readln()

    while ((typedLogin != registeredLogin) or (typedPassword != registeredPassword)) {
        print(
            """
                
            Неверный логин или пароль.
            
            Логин: """.trimIndent()
        )
        typedLogin = readln()

        print(
            """
            Пароль: """.trimIndent()
        )
        typedPassword = readln()
    }

    print("\nАвторизация прошла успешно!")

}