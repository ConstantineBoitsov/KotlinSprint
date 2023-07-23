package lesson_2

fun main() {

    val minedOreCrystal = 7
    val minedOreIron = 11

    val buffPercentageMiningPower = 20

    print("""
        С помощью усиления дополнительно добыто
        ${minedOreCrystal * buffPercentageMiningPower / 100} ед. кристаллической,
        ${minedOreIron * buffPercentageMiningPower / 100} ед. железной
        руды.
    """.trimIndent())

}