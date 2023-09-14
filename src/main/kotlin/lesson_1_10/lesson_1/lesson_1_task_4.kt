package lesson_1_10.lesson_1

fun main() {

    val length: ULong = 40_868_600_000u
    val age: UByte = 27u
    val partOfDay: Float = 0.075f
    val seconds: UShort = 6480u
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: UInt = 327000u

    println("""
         $length – расстояние, которое пролетел Гагарин пока был в космосе в миллиметрах;
         $age – возраст Гагарина на момент полета (целых лет);
         $partOfDay – какую часть дня Гагарин провел в космосе; 
         $seconds – количество секунд которое Гагарин провел в космосе;
         $partOfYear – какую часть года Гагарин провел в космосе;
         $apogee – апогей орбиты Гагарина в метрах.
    """.trimIndent())

}