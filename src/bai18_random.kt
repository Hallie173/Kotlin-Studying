import kotlin.random.Random

fun main(args: Array<String>) {
    var rd = Random
    var rdInt = rd.nextInt(-1,101)
    println(rdInt)

    var rd1 = rd.nextInt(-50,50)
    var rd2 = rd.nextDouble()
    var rd3 = rd1 + rd2
    println(rd3)

    var rd4 = rd.nextDouble() * 10
    println(rd4)
}