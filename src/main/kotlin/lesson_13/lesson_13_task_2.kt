package lesson_13

fun main() {

    val phoneBooker = PhoneBookSuperMember("Real Human Bean", 89998887766)
    phoneBooker.printInfo()

}

class PhoneBookSuperMember(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}")
    }
}