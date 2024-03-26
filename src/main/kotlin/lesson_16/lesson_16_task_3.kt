package lesson_16

fun main() {

    val userJackieChan = User("Jackie Chan", "toothpick")

    println("Login: ${userJackieChan.getLogin()}")
    do {
        print("Password: ")
        val result = userJackieChan.comparePassword(readln())
        println(result)
    } while (!result)


}

class User(

    _login: String,
    _password: String,

) {

    private val login = _login
    private val password = _password

    fun getLogin() = login
    fun getPassword() = password

    fun comparePassword(typedPassword: String) = (typedPassword == password)

}