package lesson_14

fun main() {

    val theGreatChat = Chat()

    theGreatChat.addMessage(text = "Всем привет в этом чятике!", author = "Ryan Gosling")
    theGreatChat.addThreadMessage(text = "Привет, Райан Гослинг!", author = "Kevin Smith",
        parentMessageId = (theGreatChat.currentMessageId - 1))

    theGreatChat.addMessage("Hello everynyan!", "Alien cat")
    theGreatChat.addThreadMessage("Oh my gooood!", "Human", theGreatChat.currentMessageId - 1)
    theGreatChat.addThreadMessage("How are you? Thank you!", "Alien cat", theGreatChat.currentMessageId - 1)

    val groupedMessages = theGreatChat.messageMutableList.groupBy { it.messageId }
    val groupedThreadMessages = theGreatChat.messageMutableList.groupBy { it } // НЕПОНЯТНО

}

class Chat() {

    val messageMutableList = mutableListOf<Message>()
    var currentMessageId: Int = 1

    fun addMessage(text: String, author: String) {
        messageMutableList.add(
            Message(messageId = currentMessageId++, authorName = author, messageText = text)
        )
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        messageMutableList.add(
            ChildMessage(messageId = currentMessageId++, authorName = author, messageText = text,
                parentMessageId = parentMessageId)
        )
    }

    fun printChat() {

    }
}

open class Message(
    val messageId: Int,
    val authorName: String,
    val messageText: String,
)

class ChildMessage(
    messageId: Int,
    authorName: String,
    messageText: String,
    val parentMessageId: Int,
) : Message(messageId, authorName, messageText)