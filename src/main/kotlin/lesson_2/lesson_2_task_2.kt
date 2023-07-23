package lesson_2

fun main() {

    val numberOfRegularEmployees = 50
    val numberOfInterns = 30

    val salaryOfRegularEmployee = 30000
    val salaryOfIntern = 20000

    val sumOfRegularEmployeesSalaries = numberOfRegularEmployees * salaryOfRegularEmployee
    val sumOfAllSalaries = sumOfRegularEmployeesSalaries + numberOfInterns * salaryOfIntern

    val averageSalary = sumOfAllSalaries / (numberOfRegularEmployees + numberOfInterns)

    println("""
        Расходы на выплату зарплаты постоянных сотрудников: $sumOfRegularEmployeesSalaries
        Общие расходы по зарплате после прихода стажеров: $sumOfAllSalaries
        Средняя зарплата одного сотрудника после устройства стажеров: $averageSalary
    """.trimIndent())

}