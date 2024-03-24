package lesson_16

fun main() {

    val userJackieChan = User()

    println("Login: Jackie Chan")
    do {
        print("Password: ")
        val result = userJackieChan.comparePassword(readln())
        println(result)
    } while (!result)


}

class User {

    private val login = "Jackie Chan"
    private val password = "toothpick"

    fun comparePassword(typedPassword: String) = (typedPassword == password)

}