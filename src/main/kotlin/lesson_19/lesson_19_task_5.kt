package lesson_19

fun main() {

    println("Приложение «Картотека»")
    val cardIndexList = mutableListOf<Person>()
    var typedNameAndGender: String
    var typedName: String
    var typedGender: String

    do {
        do {
            println("Введите имя и пол человека \nв формате [Имя, муж/жен]")
            typedNameAndGender = readln()
            typedName = typedNameAndGender.split("[\\s,]+".toRegex())[0]
            typedGender = typedNameAndGender.split("[\\s,]+".toRegex())[1]

            if (!typedGender.equals(other = "муж", ignoreCase = true)
                and !typedGender.equals("жен", true)
            ) {
                println("Ошибка ввода данных.")
            } else {
                cardIndexList.add(
                    Person(
                        typedName,
                        when {
                            typedGender.equals("муж", true) -> Gender.MALE
                            else -> Gender.FEMALE
                        }
                    )
                )
            }
        } while (!typedGender.equals(other = "муж", ignoreCase = true)
            and !typedGender.equals("жен", true)
        )

    } while ((typedGender.equals(other = "муж", ignoreCase = true)
                or typedGender.equals("жен", true)
                ) and (cardIndexList.size < 5)
    )

    println("Список людей в картотеке: ")
    for (i in cardIndexList) {
        println("${i.name}, ${i.gender.sex}.")
    }
}

class Person(
    val name: String,
    val gender: Gender,
)

enum class Gender(val sex: String) {
    MALE("Мужской") {
        override fun getGender(): String = MALE.sex
    },
    FEMALE("Женский") {
        override fun getGender(): String = FEMALE.sex
    };

    abstract fun getGender(): String
}