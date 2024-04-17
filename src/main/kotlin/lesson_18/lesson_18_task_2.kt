package lesson_18

fun main() {

    val diceList: List<Dice> = listOf(
        DiceFour(),
        DiceSix(),
        DiceEight()
    )

    diceList.forEach {it: Dice ->
        it.rollDice()
    }

}

abstract class Dice {

    abstract fun rollDice()

}

class DiceFour : Dice() {
    override fun rollDice() {
        println("На d4 выпало: ${(1..4).random()}")
    }
}

class DiceSix : Dice() {
    override fun rollDice() {
        println("На d6 выпало: ${(1..6).random()}")
    }
}

class DiceEight : Dice() {
    override fun rollDice() {
        println("На d8 выпало: ${(1..8).random()}")
    }
}