package lesson_16

fun main() {

    val someOrder = Order(orderNumber = 123, orderStatus = OrderStatus.NEW)

    someOrder.callManager(OrderStatus.IN_PROGRESS)

    someOrder.callManager(OrderStatus.COMPLETED)

}

class Order(

    private val orderNumber: Int,
    var orderStatus: OrderStatus,

) {

    fun callManager(newStatus: OrderStatus) {

        changeStatus(newStatus)
        println("Менеджер: Статус заказа №$orderNumber изменён на «${newStatus}»")

    }

    private fun changeStatus(newStatus: OrderStatus) {

        orderStatus = newStatus

    }

}

enum class OrderStatus {
    COMPLETED, IN_PROGRESS, NEW
}