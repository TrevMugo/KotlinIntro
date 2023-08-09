package oop

fun main(args: Array<String>) {
    println("Welcome to oop")
    var firstCar = Car("Range Rover","Sport", "KSD686T")
    var secondCar = Car("Range Rover","Discovery", "KMJ572H")
    println(secondCar.model)

    var TundaOne = Fruit("Apple", "Crimson", 30)
    var TundaTwo = Fruit("Orange", "Orange", 56)
    println(TundaTwo.price)
    println(TundaOne.price)

    var simuOne = Phone("Samsung AO4S", "Android 11","Type C")
    var simuTwo = Phone("Iphone 11 Pro Max", "iOS 17","Lightning")
    simuOne.hungUp("0744144144")
    simuTwo.call("0122122221")

    var firstStudent = Student("Mark", "mark123@gmail.com", "MArk123")
    firstStudent.register()
    firstStudent.login()

var firstTeacher = Teacher("Mug", "mugo122@gmail.com", "pass123")
    firstTeacher.logout()
    firstTeacher.login()
    firstTeacher.register()
    firstTeacher.checkAttendance()
    firstTeacher.submitResults()


    var firstHod = Hod("Kama", "kam565@gmail.com", "kama22")
    firstHod.login()
    firstHod.logout()
    firstHod.register()
    firstHod.suspendTeacher()
    firstHod.submitResults()
    firstHod.checkAttendance()


    firstStudent.setIdNumber("54778526655998")
    println(firstStudent.getIdNumber())







}
