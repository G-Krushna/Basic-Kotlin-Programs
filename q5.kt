// Check whether a number is palindrome or not

fun main() {
    var num = 121
    val original = num
    var reverse = 0

    while (num != 0) {
        val digit = num % 10
        reverse = reverse * 10 + digit
        num /= 10
    }

    if (original == reverse) {
        println("$original is Palindrome")
    } else {
        println("$original is Not Palindrome")
    }
}
