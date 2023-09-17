package lesson_11

fun main() {

    val user1 = User(
        id = 123,
        login = "DoomSlayer",
        password = "secretword",
        email = "bigbusiness@gmail.com"
    )
    val user2 = User(
        13,
        "agent007",
        "trustno1",
        "bondjamesbond@pisem.net"
    )

    printUserData(userNumber = 1, user1)
    printUserData(userNumber = 2, user2)

}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {}

fun printUserData(userNumber: Int, user: User) {
    println(
        """
        User №$userNumber:
        id: ${user.id}
        login: ${user.login}
        password: ${user.password}
        email: ${user.email}
        
    """.trimIndent()
    )
}