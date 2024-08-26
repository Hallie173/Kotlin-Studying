import kotlin.math.PI
import kotlin.math.pow

fun main(args: Array<String>) {
    var r:Double = 0.0
    println("Nhap r: ")
    var s:String? = readLine()
    if (s != null) {
        r = s.toDouble()
        println("C = " + PI*r*2)
        println("S = " + PI*r.pow(2))
    }
}