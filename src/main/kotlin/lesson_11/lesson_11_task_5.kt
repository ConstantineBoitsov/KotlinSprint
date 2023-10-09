package lesson_11

fun main() {

    val actualForum = Forum

    val user1 = actualForum.createNewUser(login = "CoolGuy", password = "assword", email = "mymail@mail.ru")
    val user2 = actualForum.createNewUser("Eminem", "secretword111", "pochta@pisem.net")


}

class Forum(
//    public var usersTotal: Int = 0,
    var chatLog: String = "",

) {
    // ФАБРИКА
    var usersTotal: Int = 0

    companion object {
//        private var usersTotal = 0
        fun createNewUser(login: String, password: String, email: String): ForumUser {
            return ForumUser(id = usersTotal, login = login, password = password, email = email)
        }
    }

    fun createNewMessage(authorId: Int, message: String): String {

    }
}

class ForumUser(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
)