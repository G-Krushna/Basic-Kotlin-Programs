// Swap two numbers without third variable

fun main() {

    var x = 5
    var y = 8

    x = x - y
    y = x + y
    x = y - x

    println("Without third variable:")
    println("x = $x")
    println("y = $y")
}
