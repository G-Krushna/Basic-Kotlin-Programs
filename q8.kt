// Count digits in a number

fun main() {
    var num = 987654
    var count = 0

    while (num != 0) {
        num /= 10
        count++
    }

    println("Number of digits = $count")
}
