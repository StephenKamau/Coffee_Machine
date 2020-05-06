data class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            field = when {
                name == "Dubai" && value !in -92..57 -> 30
                name == "Moscow" && value !in -92..57 -> 5
                name == "Hanoi" && value !in -92..57 -> 20
                else -> value
            }
        }
}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    // implement comparing here
    print(when {
        firstCity.degrees == secondCity.degrees || secondCity.degrees == thirdCity.degrees
                || firstCity.degrees == thirdCity.degrees -> "neither"
        minOf(firstCity.degrees, secondCity.degrees, thirdCity.degrees)
                == firstCity.degrees -> firstCity.name
        minOf(firstCity.degrees, secondCity.degrees, thirdCity.degrees)
                == secondCity.degrees -> secondCity.name
        minOf(firstCity.degrees, secondCity.degrees, thirdCity.degrees)
                == thirdCity.degrees -> thirdCity.name
        else -> "neither"
    })
}