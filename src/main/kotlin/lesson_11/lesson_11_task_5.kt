package lesson_11

fun main() {

    val actualForum = Forum()

    val user1 = actualForum.createNewUser(name = "CoolGuy")
    val user2 = actualForum.createNewUser(name = "CoolerGuy")

    actualForum.createNewMessage(authorId = actualForum.getUserId(user1), message = "Blah blah blah!!!")
    actualForum.createNewMessage(actualForum.getUserId(user1), "Meheheh")

    actualForum.createNewMessage(actualForum.getUserId(user2), "THIS CANNOT CONTINUE")
    actualForum.createNewMessage(actualForum.getUserId(user2), "please do not the cat")

    actualForum.printThread()

}

class Forum {
    // ФАБРИКА
    var usersTotal: Int = 0
    var usersMutableList: MutableList<ForumUser> = mutableListOf()
    var messagesMutableList: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(name: String): ForumUser {
        val newForumUser = ForumUser(userId = ++usersTotal, userName = name)
        usersMutableList.add(newForumUser)
        return newForumUser
    }

    fun getUserId(user: ForumUser): Int {
        return user.userId
    }

    fun createNewMessage(authorId: Int, message: String) {
        if (authorId in (1..usersTotal)) {
            messagesMutableList.add(ForumMessage(authorId = authorId, message = message))
        }
    }

    fun printThread() {
        messagesMutableList.forEach {
            println("${usersMutableList[it.authorId - 1].userName}: ${it.message}")
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