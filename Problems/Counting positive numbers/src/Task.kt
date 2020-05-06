import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var count = 0
    repeat(scanner.nextInt()) {
        if (scanner.nextInt() > 0) count++
    }
    print(count)
}