package lesson_1_10.lesson_10

fun main() {

    val userLogin = createLogin()
    val userPassword = generateRandomPassword(CURRENT_PASSWORD_LENGTH)

    validateLoginAndPassword(userLogin, userPassword)
    checkAccessCode()

}

fun createLogin(): String {

    println("*** РЕГИСТРАЦИЯ ***\n")

    var loginToCheck: String

    do {
        print("Придумайте логин: ")
        loginToCheck = readln()
        if (!validateLoginLength(loginToCheck)) {
            println("Логин недостаточно длинный.")
        }
    } while (!validateLoginLength(loginToCheck))

    return loginToCheck

}

fun validateLoginLength(login: String): Boolean =
    login.length >= MIN_LOGIN_LENGTH

fun generateRandomPassword(length: Int): String {

    var passwordLength = length
    var generatedPassword = ""

    while (passwordLength > 0) {
        generatedPassword += ('0'..'9').random()
        passwordLength--
        if (passwordLength-- > 0) generatedPassword += (' '..'/').random()
    }

    println("Для вас сгенерирован пароль: «$generatedPassword»")
    return generatedPassword

}

fun validateLoginAndPassword(login: String, password: String) {

    println("\n*** АВТОРИЗАЦИЯ ***\n")

    var currentLogin: String
    var currentPassword: String

    do {
        print("Введите логин: ")
        currentLogin = readln()
        print("Введите пароль: ")
        currentPassword = readln()
        if ((currentLogin != login) or (currentPassword != password)) {
            println("\nОшибка при вводе логина или пароля.\n")
        }
    } while ((currentLogin != login) or (currentPassword != password))

}

fun checkAccessCode() {

    println("\nДля завершения авторизации введите код, который был отправлен вам по SMS.\n")
    var randomAccessCode: Int
    var typedAccessCode: Int

    do {
        randomAccessCode = (1000..9999).random()
        println("** Код из SMS: $randomAccessCode **\n")
        print("Введите код из SMS: ")
        typedAccessCode = readln().toInt()
        if (typedAccessCode != randomAccessCode) {
            println("Неверный код.")
        }
    } while (typedAccessCode != randomAccessCode)

    println("Авторизация завершена успешно!")

}

const val MIN_LOGIN_LENGTH = 4
const val CURRENT_PASSWORD_LENGTH = 4