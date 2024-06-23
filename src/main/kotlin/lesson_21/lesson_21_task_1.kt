package lesson_21

fun main() {

    val stringWithVowels = "How many vowels are here?"
    println(stringWithVowels.vowelCount())

}

fun String.vowelCount(): Int {
    var vowelCounter = 0
    val vowelsList: List<Char> = listOf('e', 'y', 'u', 'i', 'o', 'a')

    for (element in this) {
        if (vowelsList.contains(element.lowercaseChar())) vowelCounter++
    }

    return vowelCounter
}