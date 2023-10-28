package lesson_13

fun main() {

    val member = PhoneBookMember("Ryan Gosling", 89219219219, null)

}

class PhoneBookMember(
    val name: String,
    val phoneNumber: Long,
    val companyName: String?,
)