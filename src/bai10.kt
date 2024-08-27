fun main(args: Array<String>) {
    var gt = 1
    println("Enter n = ")
    var n:Int? = readLine()?.toInt()
    if (n != null) {
        for (i in 1..n )
            gt *= i
    }
    println("$n! = $gt")
}