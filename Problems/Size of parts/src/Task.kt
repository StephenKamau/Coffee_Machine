import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var toBeFixed = 0
    var rejects = 0
    var readyProducts = 0
    repeat(scanner.nextInt()) {
        val input = scanner.nextInt()
        when {
            input == 1 -> toBeFixed++
            input == -1 -> rejects++
            input == 0 -> readyProducts++
        }
    }
    println("$readyProducts $toBeFixed $rejects")
}