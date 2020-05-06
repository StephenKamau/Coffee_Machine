import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val input = scanner.nextLine()
    val nums = input.split(" ").toTypedArray()
    println("${nums[0]} plus ${nums[1]} equals ${nums[0].toInt() + nums[1].toInt()}")
}