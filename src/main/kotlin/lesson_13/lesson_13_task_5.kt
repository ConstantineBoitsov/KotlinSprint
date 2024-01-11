package lesson_13

import java.lang.Exception

fun main() {

    try {
        var currentPhoneNumber: String
        println("Введите номер телефона Ryan Gosling из компании «Drive Inc.»")
        val phoneBookMember = PhoneBookAbsoluteMember("Ryan Gosling", readln().toLong(), "Drive Inc.")
    }
    catch (e: Exception) {
        println(e::class.simpleName)
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