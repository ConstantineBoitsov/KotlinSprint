package lesson_1_10.lesson_1

fun main () {

    var numberOfOrders: UInt = 75u // количество заказов
    val thankYouText: String = "Благодарим за покупку! Отличного вам настроения!"// текст с благодарностью за покупку

    println("""
        Количество заказов: 
            $numberOfOrders
        Текст с благодарностью за покупку: 
            $thankYouText
    """.trimIndent())

    var numberOfEmployees: UInt = 2000u // количество работников

//    println("""
//        Количество работников:
//            $numberOfEmployees
//    """.trimIndent())

    --numberOfEmployees

    println("""
        Количество работников:
            $numberOfEmployees
    """.trimIndent())
}