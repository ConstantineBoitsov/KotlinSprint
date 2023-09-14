package lesson_1_10.lesson_7

fun main() {

    print("Вывести все чётные числа от 0 до ")
    val upperBound = readln().toInt()

    for (i in 0..upperBound step 2) {
        print("$i ")
    }

}