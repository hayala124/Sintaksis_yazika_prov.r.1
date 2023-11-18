fun main() {
    println("Введите 2 числа и один символ (+ - * /)")
    try {
        val a = readln().toInt()
        val b = readln().toInt()
        val simbol = readln()

        when (simbol) {
            "+" -> println("результат = ${a + b}")
            "-" -> println("результат = ${a - b}")
            "*" -> println("результат = ${a * b}")
            "/" -> println("результат = ${(a / b).toDouble()}")
            else -> println("Введите правильный символ")
        }
    }
    catch (e: ArithmeticException) {
        println("На ноль делить нельзя")
    }
    catch (e: NumberFormatException) {
        println("Неправильный ввод типа данных, ввелите число")
    }
}
