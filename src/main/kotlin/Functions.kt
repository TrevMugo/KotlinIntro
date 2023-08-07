import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    //Inbuilt Functions
    var greeting = "Hello there"
    println(greeting.uppercase())
    println(greeting.lowercase())
    println(greeting.reversed())
    println(greeting.replace("there", "Trevor"))


    var number = 10.0
    println(sqrt(number))
    println(number.pow(2.0))


    //User Defined Functions
    motto()
    mama()
    add()
    addition(10,20)
    addition(79,88)
    avg(10.0, 47.55f, 88)
    println(mean(12, 56.88))
}
fun motto(){
        println("Wow, I can't believe it")
}


fun mama(){
    println("Mama mia!!")
}

fun add(){
    var x = 19
    var y = 20
    var z = x + y
    println("Your answer in $z")
}

fun addition(x:Int, y:Int){
    var z = x + y
    println("Your answer is $z")
}


fun avg(x:Double, y:Float, z:Int ){
    var average = (x + y + z) / 3.0
    println("The average is $average")
}


fun mean(x: Int, y: Double): Double {
    return (x + y) / 2.0

}

//fun fullName(firstName:String, lastName:String) :String = "$firstName $lastName"
fun fullName(firstName:String, lastName:String) :String {
    var name = "$firstName $lastName"
    return name
}
