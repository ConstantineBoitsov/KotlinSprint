package lesson_13

fun main() {

    val phoneBookMembersMutableList = mutableListOf<PhoneBookUltraMember>()

    do {
        var currentName: String
        var currentPhoneNumber: Long?
        var currentCompany: String?

        do {
            println("Новый контакт.\nВведите имя: ")
            currentName = readln()
            println("Введите номер телефона: ")
            currentPhoneNumber = readln().toLongOrNull()
            println("Введите название компании: ")
            currentCompany = readln()
            if (currentCompany == "") currentCompany = null

            if (currentPhoneNumber == null) {
                println("\nНекорректный номер телефона. Попробуйте ещё раз.\n")
            }
        } while (currentPhoneNumber == null)

        phoneBookMembersMutableList.add(PhoneBookUltraMember(currentName, currentPhoneNumber, currentCompany))

        var decisionToAddNewContact: String
        do {
            println("Добавить новый контакт? <Да/Нет>")
            decisionToAddNewContact = readln()
        } while (!decisionToAddNewContact.equals("да", true) and
            !decisionToAddNewContact.equals("нет", true))
    } while (decisionToAddNewContact.equals("да", true))

    println("\nСписок контактов: ")
    phoneBookMembersMutableList.forEach { it.printInfo() }

}

class PhoneBookUltraMember(
    val name: String,
    val phoneNumber: Long?,
    val company: String? = null,
) {
    fun printInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}\n")
    }

}