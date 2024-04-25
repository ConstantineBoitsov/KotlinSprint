package lesson_18

fun main() {

    val diceList: List<Dice> = listOf(
        DiceFour(),
        DiceSix(),
        DiceEight()
    )

    diceList.forEach { it: Dice ->
        it.rollDice()
    }

}

abstract class Dice {

    abstract val numberOfFaces: Int

    fun rollDice() {
        println("На кубике d$numberOfFaces выпало: ${(1..numberOfFaces).random()}")
    }

}

class DiceFour : Dice() {
    override val numberOfFaces: Int
        get() = 4
}

class DiceSix : Dice() {
    override val numberOfFaces: Int
        get() = 6
}

class DiceEight : Dice() {
    override val numberOfFaces: Int
        get() = 8
}