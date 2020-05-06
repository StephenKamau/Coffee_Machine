import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var output = 0
    var i = 1
    while (i != 0) {
        i = scanner.nextInt()
        output += i
    }
    println(output)
}