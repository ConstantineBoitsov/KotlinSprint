package lesson_10

fun main() {

    var humanityWinsCounter = 0
    var machinesWinsCounter = 0
    var roundNumber = 1

    println("*** Восстание машин: Судный день ***")

    do {

        when (playGameRound(roundNumber++)) {
            1 -> humanityWinsCounter++
            -1 -> machinesWinsCounter++
        }

        print("Хотите бросить кости ещё раз?\nВведите Да или Нет: ")
        var desireToContinue: String

        do {
            desireToContinue = readln()
            if (!validateAnswer(desireToContinue)) {
                print("Некорректный ответ! Да или Нет? ")
            }
        } while (!validateAnswer(desireToContinue))

    } while (desireToContinue.equals(other = "да", ignoreCase = true))

    print("Игра окончена!\n\nЧеловечество: $humanityWinsCounter\nМашины: $machinesWinsCounter")

}

fun playGameRound(roundNumber: Int): Int {

    println("Раунд $roundNumber")

    Thread.sleep(1000)

    val humansDice = throwDices()
    println("Игрок бросил кубики, выпало ${humansDice[0]} и ${humansDice[1]}")
    Thread.sleep(1000) // САСПЕНС

    val computersDice = throwDices()
    println("Компьютер бросил кубики, выпало ${computersDice[0]} и ${computersDice[1]}")
    Thread.sleep(1000) // ЕЩЁ САСПЕНС

    when (computersDice.sum() - humansDice.sum()) {
        in -1 downTo -10 -> {
            println("Победило человечество! Машины отступают!")
            return 1
        }

        0 -> {
            println("Ничья! Война человечества и машин продолжается!")
            return 0
        }

        in 1..10 -> {
            println("Победила машина! Человечество несёт потери!")
            return -1
        }

        else -> return -2
    }

}

fun throwDices(): List<Int> = listOf((1..6).random(), (1..6).random())

fun validateAnswer(answer: String) = (answer.equals("да", true) or answer.equals("нет", true))