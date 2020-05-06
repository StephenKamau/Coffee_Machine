import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val country1 = input.next()
    val country2 = input.next()
    println(Country.getCurrency(country1) == Country.getCurrency(country2))
}

enum class Country(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar");

    companion object {
        fun getCurrency(country: String): String {
            for (enum in Country.values()) {
                if (enum.name == country) {
                    return enum.currency
                }
            }
            return ""
        }
    }
}