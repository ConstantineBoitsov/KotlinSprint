package lesson_7

fun main() {

    val symbolOne = ('a'..'z').random()
    val symbolTwo = (1..9).random().toString()
    val symbolThree = ('a'..'z').random()
    val symbolFour = (1..9).random().toString()
    val symbolFive = ('a'..'z').random()
    val symbolSix = (1..9).random().toString()

    println("Сгенерированный пароль: $symbolOne$symbolTwo$symbolThree$symbolFour$symbolFive$symbolSix")

}