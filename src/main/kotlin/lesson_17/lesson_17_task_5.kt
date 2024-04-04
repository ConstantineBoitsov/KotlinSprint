package lesson_17

fun main() {

    val user1 = User("Richard", "sandman")

    user1.login = "James"

    user1.password = "blah blah blah"
    println(user1.password)

}

private class User(_login: String, _password: String) {

    var login = _login
        set(value) {
            field = value
            println("Логин успешно изменён")
        }

    var password = _password
        get() {
            var hiddenPassword = ""
            repeat(field.length) {
                hiddenPassword += "*"
            }
            return hiddenPassword
        }
        set(value) {
            println("Вы не можете изменить пароль")
        }

}