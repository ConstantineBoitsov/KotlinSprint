package lesson_13

fun main() {

    try {
        var currentPhoneNumber: String
        println("Введите номер телефона Ryan Gosling из компании «Drive Inc.»")
        val phoneBookMember = PhoneBookAbsoluteMember("Ryan Gosling", readln().toLong(), "Drive Inc.")
    }
    catch (e: NumberFormatException) {
        println("NumberFormatException")
    }

}

class PhoneBookAbsoluteMember(
    val name: String,
    val phoneNumber: Long?,
    val company: String? = null,
) {
    fun printInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}\n")
    }

}