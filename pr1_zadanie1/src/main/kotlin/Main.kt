fun main() {
    println("Введите строку символов: ")
    val stroka = readLine().toString()
    val result = StringBuilder()
    var k = 1
    for (i in 1 until stroka.length)
    {
        if (stroka[i] == stroka[i - 1])
            k++
        else
        {
            result.append(stroka[i - 1])
            if (k > 1) {
                result.append(k)
            }
            k = 1
        }
    }
    result.append(stroka[stroka.length - 1])
    if (k > 1) {
        result.append(k)
    }
    println("Вывод символа и того, сколько раз подряд она повторяется: $result")
}
