package machine

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var availableWater = 400
    var availableMilk = 540
    var availableCoffee = 120
    var availableDisposableCups = 9
    var moneyInATM = 550
    print("Write action (buy, fill, take, remaining, exit): ")
    var action = scanner.nextLine()
    while (action != "exit") {
        when (action) {
            "buy" -> {
                print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                when (scanner.next()) {
                    "1" -> {
                        if (availableWater.minus(250) >= 0 && availableCoffee.minus(16) >= 0
                                && availableDisposableCups.minus(1) >= 0) {
                            availableWater -= 250
                            availableCoffee -= 16
                            availableDisposableCups -= 1
                            moneyInATM += 4
                            println("I have enough resources, making you a coffee!\n")
                        } else {
                            println("Sorry, not enough water!\n")
                        }
                    }
                    "2" -> {
                        if (availableWater.minus(350) >= 0 && availableCoffee.minus(20) >= 0
                                && availableDisposableCups.minus(1) >= 0
                                && availableMilk.minus(75) >= 0) {
                            availableWater -= 350
                            availableMilk -= 75
                            availableCoffee -= 20
                            availableDisposableCups -= 1
                            moneyInATM += 7
                            println("I have enough resources, making you a coffee!\n")
                        } else {
                            println("Sorry, not enough water!\n")
                        }
                    }
                    "3" -> {
                        if (availableWater.minus(200) >= 0 && availableCoffee.minus(12) >= 0
                                && availableDisposableCups.minus(1) >= 0
                                && availableMilk.minus(100) >= 0) {
                            availableWater -= 200
                            availableMilk -= 100
                            availableCoffee -= 12
                            moneyInATM += 6
                            availableDisposableCups -= 1
                            println("I have enough resources, making you a coffee!\n")
                        } else {
                            println("Sorry, not enough water!\n")
                        }
                    }
                    "back" -> {

                    }
                }
            }
            "fill" -> {
                print("Write how many ml of water do you want to add: ")
                availableWater += scanner.nextInt()
                print("Write how many ml of milk do you want to add: ")
                availableMilk += scanner.nextInt()
                print("Write how many grams of coffee beans do you want to add: ")
                availableCoffee += scanner.nextInt()
                print("Write how many disposable cups of coffee do you want to add: ")
                availableDisposableCups += scanner.nextInt()
            }
            "take" -> {
                println("I gave you $moneyInATM")
                moneyInATM = 0
            }
            "remaining" -> {
                println("The coffee machine has:\n" +
                        "$availableWater of water\n" +
                        "$availableMilk of milk\n" +
                        "$availableCoffee of coffee beans\n" +
                        "$availableDisposableCups of disposable cups\n" +
                        "$$moneyInATM of money")
            }
        }
        print("Write action (buy, fill, take, remaining, exit): ")
        action = scanner.nextLine()
    }
}