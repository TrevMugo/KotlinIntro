package oop

fun main(args: Array<String>) {
    println("Welcome to oop")
    var firstCar = Car("Range Rover","Sport", "KSD686T")
    var secondCar = Car("Range Rover","Discovery", "KMJ572H")
    println(secondCar.model)

    var TundaOne = Fruit("Apple", "Crimson", 30)
    var TundaTwo = Fruit("Orange", "Orange", 56)
    println(TundaTwo.price)

    var SimuOne = Phone("Samsung AO4S", "Android 11","Type C")
    var SimuTwo = Phone("Iphone 11 Pro Max", "iOS 17","Lightning")
    SimuOne.hungUp("0744144144")
    SimuTwo.call("0122122221")
}
