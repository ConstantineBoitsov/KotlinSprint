package lesson_19

fun main() {

    println("Приложение «Картотека»")
    val cardIndexList = mutableListOf<Person>()
    var typedNameAndGender: String
    var typedName: String
    var typedGender: String

    val isMale = { gender: String ->
        gender.equals(other = "муж", ignoreCase = true)
    }
    val isFemale = { gender: String ->
        gender.equals(other = "жен", ignoreCase = true)
    }

    while (cardIndexList.size < 5) {
        println("Введите имя и пол человека в формате [Имя, муж/жен]")
        typedNameAndGender = readln()
        typedName = typedNameAndGender.split(", ")[0]
        typedGender = typedNameAndGender.split(", ")[1]

        if (!isMale(typedGender) and !isFemale(typedGender)) {
            println("Ошибка ввода данных.")
        } else {
            cardIndexList.add(
                Person(
                    typedName,
                    when {
                        isMale(typedGender) -> Gender.MALE
                        else -> Gender.FEMALE
                    }
                )
            )
        }
    }

    println("Список людей в картотеке: ")
    for (i in cardIndexList) {
        i.typeInfo()
    }
}

class Person(
    private val name: String,
    private val gender: Gender,
) {
    fun typeInfo() = println("$name, пол $gender")
}

enum class Gender(val sex: String) {
    MALE("мужской") {
        override fun getGender(): String = MALE.sex
    },
    FEMALE("женский") {
        override fun getGender(): String = FEMALE.sex
    };

    abstract fun getGender(): String
}