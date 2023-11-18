import kotlin.math.pow

fun main() {
    println("Введите 2 числа через Enter")
    try {
        val a = readln().toInt()
        val b = readln().toInt()
        if ((a + b)%2!=0)
            println("Нечётное число можно получить сложив число $a и $b = ${a + b}")
        else if ((a - b)%2!=0)
            println("Нечётное число можно получить вычтя из числа $a число $b = ${a - b}")
        else if ((b - a)%2!=0)
            println("Нечётное число можно получить вычтя из числа $b число $a = ${b - a}")
        else if ((b / a)%2!=0)
            println("Нечётное число можно получить поделив число $b на число $a = ${b / a}")
        else if ((a / b)%2!=0)
            println("Нечётное число можно получить поделив число $a на число $b = ${a / b}")
        else if ((b * a)%2!=0)
            println("Нечётное число можно получить поделив число $b на число $a = ${b * a}")
        else if (a.toDouble().pow(b) % 2 != 0.toDouble())
            println("Нечётное число можно получить возведя число $a в степень $b = ${(a.toDouble().pow(b))}")
        else if (b.toDouble().pow(a) % 2 != 0.toDouble())
            println("Нечётное число можно получить возведя число $b в степень $a = ${(b.toDouble().pow(a))}")
        else
            println("Невозможно получить нечётное число")
    }
    catch (e: NumberFormatException) {
        println("Неправильный ввод типа данных, ввелите число")
    }
}
