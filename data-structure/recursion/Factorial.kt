package recursion

// 팩토리얼
// 5! = 5 * 4 * 3 * 2 * 1 = 120
fun main() {
    try {
        println("-1! = ${factorial(-1)}")
    } catch (e: Exception) {
        println("-1 catched")
    }
    println("10! = ${factorial(10)}")
    println("5! = ${factorial(5)}")
    println("100! = ${factorial(100)}") // Long type overflow
    println("24! = ${factorial(20)}")
}

fun factorial(num: Long): Long {
    require(num >= 0) { "Invalid number" }   // throw IllegalArgumentException

    return if (num == 0L) 1  // 0! = 1
    else num * factorial(num - 1)
}
