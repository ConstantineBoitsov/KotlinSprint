package lesson_15

fun main() {

    val guitar = Instrument("Гитара", 5)
    val strings = Components("Струны", 6)
    val guitarBody = Components("Корпус гитары", 4)

    guitar.searchForComponents(guitarBody)
    guitar.searchForComponents(strings)

}

interface Searchable {

    fun searchForComponents(components: Components) {
        println("Выполняется поиск")
    }

}

abstract class Product(

    val name: String,
    val quantityInStock: Int,

)

class Instrument(

    name: String,
    quantityInStock: Int,

) : Product(name, quantityInStock), Searchable

class Components(

    name: String,
    quantityInStock: Int,

) : Product(name, quantityInStock)