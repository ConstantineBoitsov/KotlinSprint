package lesson_15

fun main() {

    val administrator = Administrator("Main admin")

    val simpleUser1 = SimpleUser("Sasha93")
    val simpleUser2 = SimpleUser("Racer777")

    simpleUser1.readForum()
    simpleUser2.readForum()

    simpleUser1.typeMessage("всем привет!!!")
    simpleUser2.typeMessage("привет!")

    administrator.deleteMessage(simpleUser1)
    administrator.deleteMessage(simpleUser2)
    administrator.typeMessage("я вам запрещаю общаться!")

    administrator.deleteUser(simpleUser1)
    administrator.deleteUser(simpleUser2)

}

abstract class ForumUser(

    val userName: String,

) {

    init {
        println("Пользователь $userName успешно создан!")
    }

    fun readForum() {
        println("*$userName читает форум*")
    }

    fun typeMessage(text: String) {
        println("$userName: $text")
    }

}

class SimpleUser(

    userName: String,

) : ForumUser(userName)

class Administrator(

    userName: String,

) : ForumUser(userName) {

    fun deleteUser(user: ForumUser) {
        println("*пользователь ${user.userName} удалён с форума*")
    }

    fun deleteMessage(user: ForumUser) {
        println("*сообщение ${user.userName} удалено*")
    }

}