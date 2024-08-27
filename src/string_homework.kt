fun main(args: Array<String>) {
    var str1:String = "English = 78 Science = 83 Math = 68 History = 85"
    var split = str1.split(" ")
    var DTB:Int = 0
    var count:Int = 0

    for (i in split) {
        if (i[0].isDigit()) {
            println(i)
            DTB += i.toInt()
            count++
        }
    }
    println("Average score = ${DTB/count}")
}