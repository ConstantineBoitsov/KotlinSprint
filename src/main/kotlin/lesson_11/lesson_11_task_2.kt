package lesson_11

fun main() {

    val newUser = SuperUser(123, "DoomSlayer", "yoyoyo", "supermail@pisem.net")

    newUser.setBio()
    newUser.changePassword()
    newUser.printUserData(1)

    newUser.mailToUser("Поздравляем с изменением пароля! Пользуйтесь новым с удовольствием!")

}

class SuperUser(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
) {
    var bio: String = ""

    fun printUserData(userNumber: Int) {
        println(
            """
            User №$userNumber:
            id: $id
            login: $login
            password: $password
            email: $email
            bio: $bio
        
        """.trimIndent()
        )
    }

    fun setBio() {
        print("Введите информацию о пользователе $login: ")
        bio = readln()
    }

    fun changePassword() {
        var oldPassword: String

        do {
            print("Для смены пароля введите старый пароль: ")
            oldPassword = readln()
            if (oldPassword != password) {
                println("Ошибка ввода.")
            }
        } while (oldPassword != password)

        print("Введите новый пароль: ")
        password = readln()

        println("Пароль изменён.")
    }

    fun mailToUser(message: String) {
        println("$login,\n$message")
    }
}