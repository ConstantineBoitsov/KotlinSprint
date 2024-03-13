package lesson_14

fun main() {

    val theGreatChat = Chat()

    val message1 = theGreatChat.addMessage(text = "Всем привет в этом чятике!", author = "Ryan Gosling")
    theGreatChat.addThreadMessage(text = "Привет, Райан Гослинг!", author = "Kevin Smith",
        parentMessageId = message1.messageId)

    val message2 = theGreatChat.addMessage("Hello everynyan!", "Alien cat")
    theGreatChat.addThreadMessage("Oh my gooood!", "Human", message2.messageId)
    theGreatChat.addThreadMessage("How are you? Thank you!", "Alien cat", message2.messageId)

    theGreatChat.printChat()

}

class Chat {

    val messageList = mutableListOf<Message>()
    var currentMessageId: Int = 0

    fun addMessage(text: String, author: String) : Message {

        val message = Message(messageId = currentMessageId++, authorName = author, messageText = text)
        messageList.add(message)

        return message
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) : ChildMessage {

        val childMessage = ChildMessage(messageId = currentMessageId++, authorName = author, messageText = text,
            parentMessageId = parentMessageId)
        messageList.add(childMessage)

        return childMessage
    }

    fun printChat() {

        val groupedMessagesMap: Map<Int, List<Message>> = messageList.groupBy {
            if (it is ChildMessage) it.parentMessageId
            else it.messageId
        }

        groupedMessagesMap.forEach {(_, messageList) ->
            messageList.forEach { message ->
                val tab = if (message is ChildMessage) "\t" else ""
                println("$tab${message.authorName}: ${message.messageText}")
            }
        }

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