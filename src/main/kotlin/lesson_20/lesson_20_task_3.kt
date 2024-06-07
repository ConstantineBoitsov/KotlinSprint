package lesson_20

fun main() {

    val isTheKeyFound: (PlayerDoorOpener) -> Unit = { player: PlayerDoorOpener ->
        when (player.keyStatus) {
            KeyStatus.YES -> println("Игрок открыл дверь.")
            KeyStatus.NO -> println("Дверь заперта.")
        }
    }

    val player1 = PlayerDoorOpener(keyStatus = KeyStatus.NO)
    isTheKeyFound(player1)

    player1.findTheKey()
    isTheKeyFound(player1)

}

class PlayerDoorOpener(
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