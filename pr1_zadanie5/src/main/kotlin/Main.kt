import java.lang.NumberFormatException
import kotlin.math.pow

fun main() {
    try {
        println("Введите число x: ")
        val x = readln().toDouble()
        println("Введите число n: ")
        val n = readln().toDouble()
        var y = 0
        while (x.pow(y) != n) {
            if (x.pow(y).toInt() > n) {
                return println("Целочисленный показатель не существует")
            }
            y++
        }
        println("Число ${x.toInt()} в степени $y = ${n.toInt()}")
    }
    catch (e: NumberFormatException) {
        println("Неправильно введен тип данных")
    }
}
