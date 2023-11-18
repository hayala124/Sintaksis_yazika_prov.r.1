fun main() {
    println("Введите число в 10-ой системе счисления: ")
    val a = readLine()!!.toInt()
    val perevod = a.toString(2)
    println("Число $a в 2-ой системе счисления = $perevod")
}
