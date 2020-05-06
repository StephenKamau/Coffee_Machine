import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var input = scanner.nextInt()
    print("$input ")
    while (input != 1) {
        if (input % 2 == 0) {
            input /= 2
        } else if (input % 2 != 0) {
            input = (input * 3).plus(1)
        }
        print("$input ")
    }
}