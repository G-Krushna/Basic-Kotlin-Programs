// Find the largest among three numbers

fun main() {
    val a = 15
    val b = 40
    val c = 25

    if (a >= b && a >= c) {
        println("$a is Largest")
    } else if (b >= a && b >= c) {
        println("$b is Largest")
    } else {
        println("$c is Largest")
    }
}
