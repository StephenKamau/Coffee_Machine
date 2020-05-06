import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val firstNumber = scanner.nextLong()
    val operation = scanner.next()
    val secondNumber = scanner.nextLong()
    println(
            when (operation) {
                "+" -> firstNumber + secondNumber
                "-" -> firstNumber - secondNumber
                "/" -> {
                    if (secondNumber != 0L) {
                        firstNumber / secondNumber
                    } else {
                        "Division by 0!"
                    }
                }
                "*" -> firstNumber * secondNumber
                else -> "Unknown operator"
            })
}