package lesson_20

fun main() {

    val pickUpHealingPotion: (Player) -> Unit = { player: Player ->
        println("Подобрано лечебное зелье! Восстановлено ${player.maxHealth - player.currentHealth} очков здоровья!")
        player.currentHealth = player.maxHealth
    }

    val player1 = Player(name = "Alistair", currentHealth = 100, maxHealth = 150)
    player1.typeHealth()

    pickUpHealingPotion(player1)
    player1.typeHealth()

}

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
) {
    fun typeHealth() = println("У игрока $name $currentHealth/$maxHealth очков здоровья.")
}