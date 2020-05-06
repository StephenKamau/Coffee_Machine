import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val noOfDays = scanner.nextInt()
    val foodCostPerDay = scanner.nextInt()
    val oneWayFlightCost = scanner.nextInt()
    val oneNightHotelCost = scanner.nextInt()
    val totalCost = (noOfDays * foodCostPerDay)
            .plus(oneWayFlightCost.plus(oneWayFlightCost))
            .plus(noOfDays.minus(1) * oneNightHotelCost)
    println(totalCost)
}