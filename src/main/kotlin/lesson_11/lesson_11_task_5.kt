package lesson_11

fun main() {

    val actualForum = Forum()

    val user1 = actualForum.createNewUser(name = "CoolGuy")
    val user2 = actualForum.createNewUser(name = "CoolerGuy")

    actualForum.createNewMessage(authorId = user1.userId, message = "Blah blah blah!!!")
    actualForum.createNewMessage(user1.userId, "Meheheh")

    actualForum.createNewMessage(user2.userId, "THIS CANNOT CONTINUE")
    actualForum.createNewMessage(user2.userId, "please do not the cat")

    actualForum.printThread()

}

class Forum {
    // ФАБРИКА
    var usersTotal: Int = 0
    var usersMutableList: MutableList<ForumUser> = mutableListOf()
    var messagesMutableList: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(name: String): ForumUser {
        val newForumUser = ForumUser(userId = usersTotal++, userName = name)
        usersMutableList.add(newForumUser)
        return newForumUser
    }

    fun getUserNameById(userId: Int): String? {
        return usersMutableList.firstOrNull { it.userId == userId }?.userName
    }

    fun createNewMessage(authorId: Int, message: String) {
        if (authorId in (0..usersTotal)) {
            messagesMutableList.add(ForumMessage(authorId = authorId, message = message))
        }
    }

    fun printThread() {
        messagesMutableList.forEach { message: ForumMessage ->
            println("${getUserNameById(message.authorId)}: ${message.message}")
        }
    }
}

class ForumUser(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)