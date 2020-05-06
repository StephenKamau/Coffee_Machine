import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var currentN = 0
    repeat(scanner.nextInt()) {
        val n = scanner.nextInt()
        if (n % 4 == 0) {
            currentN = maxOf(currentN, n)
        }
    }
    println(currentN)
}