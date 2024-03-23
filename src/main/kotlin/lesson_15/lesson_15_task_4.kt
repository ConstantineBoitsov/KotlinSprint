package lesson_15

fun main() {

    val guitar = Instrument("Гитара", 5)
    val strings = Component("Струны", 6)
    val guitarBody = Component("Корпус гитары", 4)

    guitar.searchForComponents(guitarBody)
    guitar.searchForComponents(strings)

}

interface Searchable {

    fun searchForComponents(components: Component) {
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

class Component(

    name: String,
    quantityInStock: Int,

) : Product(name, quantityInStock)