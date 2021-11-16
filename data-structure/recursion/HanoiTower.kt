package recursion

// 하노이 타워
fun main() {
    hanoiTower(3, 'A', 'B', 'C')
}

fun hanoiTower(num: Int, from: Char, by: Char, to: Char) {
    if (num == 1) {
        // 원반 한 개 남으면 to로 이동
        println("원반 $num 을(를) $from 에서 $to 로 이동")
    } else {
        hanoiTower(num-1, from, to, by)
        println("원반 $num 을(를) $from 에서 $to 로 이동")
        hanoiTower(num-1, by, from, to)
    }
}
