fun main() {
    val input = readLine()!!
    // write code here
    if (input.isNotEmpty()) {
        when {
            input.first() == 'i' -> {
                println(input.drop(1).toInt().inc())
            }
            input.first() == 's' -> {
                println(input.drop(1).reversed())
            }
            else -> {
                println(input)
            }
        }
    }
}