package lesson_16

fun main() {

    val player1 = Player("Terminator", 100, 30)
    val player2 = Player("Rambo", 100, 30)

    println("${player1.name} vs ${player2.name}!")

    player1.attack(player2)
    player2.attack(player1)
    player1.heal()
    player2.attack(player1)
    player1.attack(player2)
    player2.heal()
    player1.attack(player2)
    player2.attack(player1)
    player1.attack(player2)

}

class Player(

    val name: String,
    private var maxHealth: Int,
    private var hitDamage: Int,

    ) {

    private var currentHealth = maxHealth
    private var healingPower = 20

    fun attack(opponent: Player) {
        opponent.currentHealth -= hitDamage
        println("$name атаковал ${opponent.name} на $hitDamage очков урона")
        opponent.isDead()
    }

    fun heal() {
        val healthHealed: Int

        // Нельзя вылечиться выше максимума очков здоровья
        if (currentHealth + healingPower <= maxHealth) {

            currentHealth += healingPower
            healthHealed = healingPower

        } else {

            healthHealed = maxHealth - currentHealth
            currentHealth = maxHealth

        }

        println("$name восстановил $healthHealed очков здоровья")
    }

    private fun isDead(): Boolean {
        return if (currentHealth <= 0) {
            deathOfPlayer()
            true
        } else false
    }

    private fun deathOfPlayer() {
        currentHealth = 0
        hitDamage = 0
        healingPower = 0
        println("$name lost this battle")
    }

}