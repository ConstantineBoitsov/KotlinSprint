package lesson_21

import java.io.File

fun main() {

    val file = File("three yos.txt")
    file.writeToFile("yo yo yo!")

}

fun File.writeToFile(message: String) {
    writeText(message)
}