// Temperature conversion

fun main() {

    // Celsius to Fahrenheit
    val celsius = 37.0
    val fahrenheit = (celsius * 9 / 5) + 32

    println("Celsius to Fahrenheit:")
    println("$celsius C = $fahrenheit F")

    // Fahrenheit to Celsius
    val f = 98.6
    val c = (f - 32) * 5 / 9

    println("Fahrenheit to Celsius:")
    println("$f F = $c C")
}
