package lesson_21

fun main() {

    val unhealthyPlayer = PlayerWithHealth(name = "Rodger", currentHealth = 15, maxHealth = 20)
    println(unhealthyPlayer.isHealthy())

}

class PlayerWithHealth(
    private val name: String,
    private var currentHealth: Int,
    private val maxHealth: Int,
) {
    fun typeHealth() = println("У игрока $name $currentHealth/$maxHealth очков здоровья.")

    fun getCurrentHealth() = currentHealth
    fun getMaxHealth() = maxHealth
}

fun PlayerWithHealth.isHealthy(): Boolean {
    return (this.getCurrentHealth() == this.getMaxHealth())
}