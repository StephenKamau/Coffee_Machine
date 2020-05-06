fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

class ByteTimer(t: Int) {
    var time: Int = when {
        t < -128 -> -128
        t > 127 -> 127
        else -> t
    }
}