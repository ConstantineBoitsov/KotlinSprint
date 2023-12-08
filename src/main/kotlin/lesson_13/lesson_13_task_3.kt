package lesson_13

fun main() {

    val phoneMembersList: List<PhoneBookSuperDuperMember> = listOf(
        PhoneBookSuperDuperMember("Ryan Gosling", 89998887766, null),
        PhoneBookSuperDuperMember("Real Human Bean", 84856692365, null),
        PhoneBookSuperDuperMember("Real Hero", 89379573758, "null"),
        PhoneBookSuperDuperMember("The Driver", 89998887766, "Drive Inc."),
        PhoneBookSuperDuperMember("Literally Me", 89223459694, "Drive Inc."),
    )
    val companiesList = phoneMembersList.distinctBy { it.company }

    companiesList.forEach {
        if (it.company != null) println(it.company)
    }

}

class PhoneBookSuperDuperMember(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}")
    }
}