package lesson_2

import kotlin.math.pow

fun main() {

    val initialDeposit = 70_000 // начальный вклад
    val interestRate = 16.7 // процентная ставка
    val durationOfDeposit = 20 // количество периодов, в которые происходит начисление

    val compoundInterest = initialDeposit *
            (1 + interestRate / 100).pow(durationOfDeposit) // формула сложных процентов

    print(String.format("""
        Начальный вклад: $initialDeposit
        Процентная ставка: $interestRate
        Срок вложения: $durationOfDeposit
        >> Размер вклада в конце срока: %.3f
    """.trimIndent(), compoundInterest))

}