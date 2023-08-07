package lesson_6

fun main() {

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