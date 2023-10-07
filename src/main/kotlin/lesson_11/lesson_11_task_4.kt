package lesson_11

fun main() {

    val contact = Contact(
        firstName = "First Name",
        secondName = "Second Name",
        contactPicture = "ShockedMouse.ico",
        cellPhoneNumber = "8 (999) 999-42-42",
        homePhoneNumber = "8 (999) 000-42-42",
        iCloudMail = "mail@mail.ru",
        closePersonAttachedContactList = listOf(
            ClosePersonAttachedContact(
                personRelation = "жена",
                name = "userName"
            ),
            ClosePersonAttachedContact("подруга", "userName"),
            ClosePersonAttachedContact("подруга", "userName")
        )
    )

}

class Contact(
    var firstName: String,
    var secondName: String,
    var contactPicture: String,
    var cellPhoneNumber: String,
    var homePhoneNumber: String,
    val iCloudMail: String,
    val closePersonAttachedContactList: List<ClosePersonAttachedContact>,
) {
    fun typeTextMessage() {}
    fun audioCall() {}
    fun videoCall() {}
    fun sendMail() {}

    fun faceTimeVideoCall() {}
    fun faceTimeAudioCall() {}
}

class ClosePersonAttachedContact(
    val personRelation: String,
    val name: String,
)