// Print prime numbers from 1 to N

fun main() {

    val n = 50

    for (i in 2..n) {

        var isPrime = true

        for (j in 2..i / 2) {

            if (i % j == 0) {
                isPrime = false
                break
            }
        }

        if (isPrime) {
            print("$i ")
        }
    }
}
