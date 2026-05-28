// Find factorial of a number

fun main() {
    val num = 5
    var fact = 1

    for (i in 1..num) {
        fact *= i
    }

    println("Factorial = $fact")
}
