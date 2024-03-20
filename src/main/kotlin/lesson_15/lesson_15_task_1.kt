package lesson_15

fun main() {

    val crucianCarp = CrucianCarp("Карась")
    crucianCarp.typeName()
    crucianCarp.move()

    val seagull = Seagull("Чайка")
    seagull.typeName()
    seagull.move()

    val duck = Duck("Утка")
    duck.typeName()
    duck.move()

}

interface Animal {

    val name: String

    fun typeName() {
        print("$name ")
    }

}

interface Swimming {

    fun move() {
        println("плывёт")
    }

}

interface Flying {

    fun move() {
        println("летит")
    }

}

class CrucianCarp(override val name: String) : Animal, Swimming

class Seagull(override val name: String) : Animal, Flying

class Duck(override val name: String) : Animal, Flying, Swimming {

    override fun move() {
        println("плывёт или летит")
    }

}