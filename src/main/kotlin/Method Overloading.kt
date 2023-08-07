fun main(args: Array<String>) {
    avg(10,33.44)
    avg(28, 44.67, 45.787f)
}
fun avg(x:Int, y:Double){
    var answer = (x + y) / 2.0
    println("The average from AVG1 is $answer")
}

fun avg(x:Int, y:Double, z:Float){
    var answer = (x + y + z) / 3.0
    println("The average from AVG2 is $answer")
}