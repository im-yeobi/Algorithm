package recursion

// 피보나치 수열
fun main() {
    repeat(10) { index ->
        print("${fibonacci(index.toLong())} ")
    }
}

fun fibonacci(num: Long): Long =
    require(num >= 0) { "Invalid number" }
        .let {
            when (num) {
                0L -> 0
                1L -> 1
                else -> fibonacci(num - 2) + fibonacci(num - 1)
            }
        }
