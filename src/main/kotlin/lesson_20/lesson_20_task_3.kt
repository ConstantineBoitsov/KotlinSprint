package lesson_20

fun main() {

    val isTheKeyFound: (Player) -> Unit = { player: Player ->
        when (player.keyStatus) {
            KeyStatus.YES -> println("Игрок открыл дверь.")
            KeyStatus.NO -> println("Дверь заперта.")
        }
    }

    val player1 = Player(keyStatus = KeyStatus.NO)
    isTheKeyFound(player1)

    player1.findTheKey()
    isTheKeyFound(player1)

}

class Player(
    var keyStatus: KeyStatus,
) {
    fun findTheKey() {
        println("Игрок нашёл ключ от двери!")
        keyStatus = KeyStatus.YES
    }
}

enum class KeyStatus {
    YES,
    NO
}