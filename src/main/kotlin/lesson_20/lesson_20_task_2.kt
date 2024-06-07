package lesson_20

fun main() {

    val pickUpHealingPotion: (PlayerPotionDrinker) -> Unit = { player: PlayerPotionDrinker ->
        println("Подобрано лечебное зелье! Восстановлено ${player.maxHealth - player.currentHealth} очков здоровья!")
        player.currentHealth = player.maxHealth
    }

    val player1 = PlayerPotionDrinker(name = "Alistair", currentHealth = 100, maxHealth = 150)
    player1.typeHealth()

    pickUpHealingPotion(player1)
    player1.typeHealth()

}

class PlayerPotionDrinker(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
) {
    fun typeHealth() = println("У игрока $name $currentHealth/$maxHealth очков здоровья.")
}