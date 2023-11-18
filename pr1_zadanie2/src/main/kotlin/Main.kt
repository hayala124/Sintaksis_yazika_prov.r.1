fun main () {
    println("Введите строку символов: ")
    val stroka = readLine().toString()
    val k = HashMap<Char, Int>()
    for (char in stroka) {
        if (k.containsKey(char)) {
            k[char] = k[char]!! + 1
        } else {
            k[char] = 1
        }
    }
    val sortedChars = k.keys.sorted()
    println("Вывод количества символов в алфавитном порядке: ")
    for (char in sortedChars) {
        println("$char - ${k[char]}")
    }
}
