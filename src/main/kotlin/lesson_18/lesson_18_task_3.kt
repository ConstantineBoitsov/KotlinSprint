package lesson_18

fun main() {

    val tamagochiPetsList: List<Tamagochi> = listOf(
        TamagochiFox("Лисичка-сестричка"),
        TamagochiDog("Пёсик-барбосик"),
        TamagochiCat("Котик-меховой животик")
    )

    tamagochiPetsList.forEach { it: Tamagochi ->
        it.eat()
    }

}

abstract class Tamagochi(val name: String) {

    abstract val eatAction: String

    open fun eat() {
        println("$name -> $eatAction")
    }

    open fun sleep() {
        println("$name -> спит")
    }

}

class TamagochiFox(
    name: String,
) : Tamagochi(name) {

    override val eatAction = "ест ягоды"

}

class TamagochiDog(
    name: String,
) : Tamagochi(name) {

    override val eatAction = "грызёт косточку"

}

class TamagochiCat(
    name: String,
) : Tamagochi(name) {

    override val eatAction = "ест рыбку"

}