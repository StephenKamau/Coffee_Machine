import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val stringOne = scanner.next()
    val operation = scanner.next()
    val stringTwo = scanner.next()
    println(
            when(operation){
                "plus" -> stringOne.plus(stringTwo)
                "equals" -> stringOne == stringTwo
                "endsWith"-> stringOne.endsWith(stringTwo)
                else -> "Unknown operation"
            }
    )
}