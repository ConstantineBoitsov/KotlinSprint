package lesson_19

fun main() {

    val fishNames = mutableListOf<String>()
    for (fish in Fishes.entries) {
        fishNames.add(fish.fishName)
    }

    println("Доступные рыбки: ${fishNames.joinToString(separator = ", ", postfix = ".")}")

}

enum class Fishes(val fishName: String) {
    GUPPY(fishName = "Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок")
}