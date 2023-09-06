package lesson_10

fun main() {

    println("Придумайте логин и пароль.")
    var loginToCheck: String
    var passwordToCheck: String

    do {
        print("Логин: ")
        loginToCheck = readln()
        print("Пароль: ")
        passwordToCheck = readln()
        if (!isValidLength(loginToCheck, passwordToCheck)) {
            println("Логин или пароль надостаточно длинные")
        }
    } while (!isValidLength(loginToCheck, passwordToCheck))

    println("Добро пожаловать!")

}

fun isValidLength(login: String, password: String): Boolean =
    (login.length >= MIN_LOGIN_OR_PASSWORD_LENGTH) and (password.length >= MIN_LOGIN_OR_PASSWORD_LENGTH)

const val MIN_LOGIN_OR_PASSWORD_LENGTH = 4